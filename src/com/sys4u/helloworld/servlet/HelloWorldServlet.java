package com.sys4u.helloworld.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sys4u.helloworld.file.CounterFileIncrementer;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = -7286323638457672097L;

	//Source -> implement/override Methods -> doget생성
	//HttpServletRequest -> http 요청(혹은 응답)을 객체화한것, url, head등의 정보를 가지고 있음
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CounterFileIncrementer incrementer = new CounterFileIncrementer();
		int value = incrementer.incrementAndGet();
		
		StringBuilder responseMessage = new StringBuilder();
		responseMessage.append("<!DOCTYPE html>")
				.append("<html>"                                   )
				.append("	<head>"                                )
				.append("		<meta charset='UTF-8'>"            )
				.append("		<title>Index Page</title>"         )
				.append("	</head>"                               )
				.append("	<body>"                                )
				.append("		<h2>Hello World!!</h2><br>"        )
				.append("		<h3>visiter Count : </h3>" + value )
				.append("	</body>"                               )
				.append("</html>"                                  );                                                            
		//response에 String으로 전송
		response.getWriter().write(responseMessage.toString());
	}
	
	//server는 httpServlet이 생성되었는지 모르기 때문에 서버에 등록해야한다. 

}
