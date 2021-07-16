package com.xworkz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.app.bean.CradleBean;

public class CradleTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("context.xml");
		CradleBean bean=applicationContext.getBean(CradleBean.class);
				System.out.println(bean);

	}

}
