package com.kongl.cxf.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.kongl.cxf.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String sayHi(String text) {
		System.out.println("你是谁 ："+text);
		return "Hello "+text;
	}

}
