package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.bean.WahingMachineBean;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		WahingMachineBean bean = applicationContext.getBean(WahingMachineBean.class);
		System.out.println(bean);

	}

}
