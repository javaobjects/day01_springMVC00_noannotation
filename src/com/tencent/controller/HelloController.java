package com.tencent.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 
* <p>Title: HelloController</p>  
* <p>
*	Description: 
*   	处理器
* </p> 
* @author xianxian 
* @date 2019年10月15日
 */
public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		
		//1. 保存数据，相当于request.setAttribute("message",""恭喜你，成功访问第一个springMVC环境........"");
		mav.addObject("message","恭喜你，成功访问第一个springMVC环境........");
		
		//2. 跳转页面,相当于request.getRequestDispather("/main.jsp").forward(request.response);
		mav.setViewName("/main.jsp");
		
		
		return mav;
	}

}
