package com.corona.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.corona.app.bean.CoronaBean;
import com.corona.app.bean.IndianBean;

public class IndiaCoronaTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		IndianBean bean = applicationContext.getBean(IndianBean.class);
		System.out.println(bean);
		CoronaBean tBean = applicationContext.getBean(CoronaBean.class);
		System.out.println(tBean);
	}

}
