package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.bean.StationaryBean;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		StationaryBean bean = applicationContext.getBean(StationaryBean.class);
		System.out.println(bean);

	}

}
