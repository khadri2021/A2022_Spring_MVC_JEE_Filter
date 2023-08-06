package com.khadri.spring.jee.mvc;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LoginFilter invoked ");
		String user = request.getParameter("name");
		
		if("jhon".equalsIgnoreCase(user)) {
		chain.doFilter(request, response);
		}else {
			throw new RuntimeException("Invalid user");
		}
		
	}

}
