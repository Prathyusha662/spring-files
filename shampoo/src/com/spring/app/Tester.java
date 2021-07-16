package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.bean.ShampooBean;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		ShampooBean bean = applicationContext.getBean(ShampooBean.class);
		bean.displayPlanet();
		bean.getLife();
		System.out.println(bean);

	}

}

