package com.prathu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prathu.app.bean.InkBean;
import com.prathu.app.bean.PenBean;

public class PenInkTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		PenBean bean = applicationContext.getBean(PenBean.class);
		System.out.println(bean);
		InkBean tBean = applicationContext.getBean(InkBean.class);
		System.out.println(tBean);
	}

}
