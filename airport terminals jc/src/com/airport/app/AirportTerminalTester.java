package com.airport.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airport.app.bean.AirportBean;
import com.airport.app.bean.TerminalBean;

public class AirportTerminalTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		AirportBean bean = applicationContext.getBean(AirportBean.class);
		System.out.println(bean);
		TerminalBean tBean = applicationContext.getBean(TerminalBean.class);
		System.out.println(tBean);
	}

}
