package com.stip.net.security;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import com.stip.net.mp.dto.DispatchMessage;
import com.stip.net.utils.ContextBeanUtils;

/**
 * 并发控制
 * 
 * @author cja
 */
@Component
@Scope("singleton")
public class StipDispatcherServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1L;
	public int queueSize = 1;
    public volatile BlockingQueue<DispatchMessage> queue = new LinkedBlockingQueue<DispatchMessage>(queueSize);
    private static RequestProducer requestProducer;
    private static RequestConsumer requestConsumer;
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	private volatile DispatchMessage dm;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (null == threadPoolTaskExecutor) {
			threadPoolTaskExecutor = (ThreadPoolTaskExecutor) ContextBeanUtils.getBean("threadPoolTaskExecutor");
		}
		if (null == requestProducer) {
			requestProducer =new RequestProducer( );
			threadPoolTaskExecutor.execute(requestProducer);
		}
		if (null == requestConsumer) {
			requestConsumer =new RequestConsumer( );
			threadPoolTaskExecutor.execute(requestConsumer);
		}
		
		dm=new DispatchMessage();
		dm.setRequest(request);
		dm.setResponse(response);
		queue.put(dm);
		
		logger.info("添加请求入队列");
	}
	
	class RequestProducer  implements Runnable {
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
	    public RequestProducer( ) {
			super();
		}
		
		  @Override
		    public void run() {
		        try {
		        	produce();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    
		  private void produce() {
			  while(true){
	                synchronized(queue){
	                    while(queue.size() > queueSize){
	                        try {
	                            queue.wait();
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                            queue.notify();
	                        }
	                    }
	                     
	                    queue.notify();
	                }
	            }
	        }
			
	}
	
	class RequestConsumer extends DispatcherServlet implements Runnable{
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
	    public RequestConsumer() {
			super();
		}

		@Override
	    public void run() {
	        try {
				cousume();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
		protected void doDispatch(HttpServletRequest request, HttpServletResponse response){
			try {
				super.doDispatch(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void cousume() throws Exception {
            while(true){
				synchronized (queue) {
					while (queue.size() == 0) {
						try {
							//logger.info("队列空，等待数据。。。");
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							queue.notify();
						}
					}
					DispatchMessage dispatchMessage =queue.poll();
					doDispatch(dispatchMessage.getRequest(), dispatchMessage.getResponse());
					queue.notify();
					logger.info("消费-------------------------------------------");
				}
            }
            
        }
	}
	
}
