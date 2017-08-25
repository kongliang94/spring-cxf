package com.kongl.cxf.service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService(targetNamespace="http://service.cxf.kongl.com/",
name="WeatherInterface",//porttype的名称
portName="WeatherInterfacePort",
serviceName="WeatherInterfaceService"
)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
	//根据城市名称查询未来三天的天气
	public String queryWeather(String cityName) throws Exception;
}
