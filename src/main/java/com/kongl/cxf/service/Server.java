package com.kongl.cxf.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.nio.NetworkTrafficSelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;


public class Server {

	/*protected Server() throws Exception {
		System.out.println("Starting Server");

		org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server();

		ServerConnector connector=new ServerConnector(server);
		//NetworkTrafficSelectChannelConnector channelConnector=new NetworkTrafficSelectChannelConnector(server);
		//channelConnector.setPort(9002);
		//SelectChannelConnector connector = new SelectChannelConnector();
		connector.setPort(9002);
		//server.setConnectors(new Connector[] {connector});
		//server.setConnectors(new Connector[] {channelConnector});

		WebAppContext webappcontext = new WebAppContext();
		webappcontext.setContextPath("/");

		webappcontext.setWar("target/spring-cxf.war");

		HandlerCollection handlers = new HandlerCollection();
		handlers.setHandlers(new Handler[] {webappcontext, new DefaultHandler()});

		server.setHandler(handlers);
		server.start();
		System.out.println("Server ready...");
		server.join();
	}*/

	protected Server() throws Exception {

		/*//创建服务工厂bean
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		//指定服务接口
		jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		//指定服务实现对象
		jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		//指定webservice的地址
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:1234/weather");
		//创建webservice服务
		jaxWsServerFactoryBean.create();*/

	}
	public static void main(String args[]) throws Exception {
		new Server();
	}
}
