package com.wangjie.spring.exceptionHandler;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 26297 on 2016/12/29.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {


	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

		if(e instanceof NumberFormatException){
			System.out.println("NumberFormatException...");
			return new ModelAndView("helloWorld");
		}else if(e instanceof NullPointerException){
			System.out.println("NullPointerException...");
			return new ModelAndView("helloWorld");
		}
//        else{
//			System.out.println("Don't konw....");
//			return new ModelAndView("helloWorld");
//		}
        return null;
	}
}
