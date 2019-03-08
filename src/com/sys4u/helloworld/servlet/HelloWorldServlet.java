package com.sys4u.helloworld.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys4u.helloworld.file.CounterFileIncrementer;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = -7286323638457672097L;

	@Override
	public void init() throws ServletException {
		//dbcp  
		super.init();
	}

	//Source -> implement/override Methods -> doget����
	//HttpServletRequest -> http ��û(Ȥ�� ����)�� ��üȭ�Ѱ�, url, head���� ������ ������ ����
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CounterFileIncrementer incrementer = new CounterFileIncrementer();
		int count = incrementer.incrementAndGet();
		request.setAttribute("count", count);
		request.getRequestDispatcher("/WEB-INF/jsp/helloWorld.jsp").forward(request, response);
	}
	//server�� httpServlet�� �����Ǿ����� �𸣱� ������ ������ ����ؾ��Ѵ�. -> web.xml
	

}
