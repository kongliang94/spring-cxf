package com.kongl.cxf.service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	public String sayHi(String text);
}
