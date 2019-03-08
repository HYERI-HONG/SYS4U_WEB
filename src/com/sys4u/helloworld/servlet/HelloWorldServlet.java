package com.sys4u.helloworld.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys4u.helloworld.file.CounterFileIncrementer;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = -7286323638457672097L;

	//Source -> implement/override Methods -> doget����
	//HttpServletRequest -> http ��û(Ȥ�� ����)�� ��üȭ�Ѱ�, url, head���� ������ ������ ����
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CounterFileIncrementer incrementer = new CounterFileIncrementer();
		int value = incrementer.incrementAndGet();
		
		StringBuilder responseMessage = new StringBuilder();
		responseMessage.append(
				"<!DOCTYPE html>" + 
				"<html>" + 
				"	<head>" + 
				"		<meta charset='UTF-8'>" + 
				"		<title>Index Page</title>" + 
				"	</head>" + 
				"	<body>" + 
				"		<h2>Hello World!!</h2><br>" + 
				"		<h3>visiter Count : </h3>" + value+
				"	</body>" + 
				"</html>"
		);
		//response�� String���� ����
		response.getWriter().write(responseMessage.toString());
	}
	
	//server�� httpServlet�� �����Ǿ����� �𸣱� ������ ������ ����ؾ��Ѵ�. 

}