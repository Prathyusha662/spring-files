package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.bean.UpsBean;

public class UpsTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		UpsBean bean = applicationContext.getBean(UpsBean.class);
		System.out.println(bean);

	}

}
