package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.bean.PlayerBean;


public class PlayerTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		PlayerBean bean = applicationContext.getBean(PlayerBean.class);
		System.out.println(bean);

	}

}
