package com.stip.net.security;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.stip.net.mp.dto.DispatchMessage;

public class RequestQueue {
	public int queueSize = 1;
    public BlockingQueue<DispatchMessage> queue = new LinkedBlockingQueue<DispatchMessage>(queueSize);
}
