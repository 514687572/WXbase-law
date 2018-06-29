package com.stip.net.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.service.WalletService;

/**
 * @author cja
 */
@RestController
@RequestMapping("/wallet")
public class WalletController {
	@Autowired
	private WalletService walletService;
	
	/**
	 * @Description: 查询用户余额
	 * @param request
	 */
	@RequestMapping("/getWalletBalance")
	public Map<String, Object> getWalletBalance(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		String balance=walletService.getWalletBalance(openid);
		
		result.put("success", Boolean.TRUE);
		result.put("balance", balance);
		
		return result;
	}
	
}
