package com.ys.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.app.bean.BookBean;
import com.ys.app.bean.PagesBean;

public class BookTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		BookBean bean = applicationContext.getBean(BookBean.class);
		System.out.println(bean.getId());
		PagesBean remoteBean = applicationContext.getBean(PagesBean.class);
		System.out.println(remoteBean);
	}

}
