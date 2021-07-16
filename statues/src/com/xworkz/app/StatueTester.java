package com.xworkz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.app.bean.StatueBean;

public class StatueTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("context.xml");
		StatueBean bean=applicationContext.getBean(StatueBean.class);
				System.out.println(bean);
	}

	}

