package com.prathyu.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prathyu.app.bean.GlassBean;
import com.prathyu.app.bean.WindowBean;

public class WindowGlassTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		WindowBean bean = applicationContext.getBean(WindowBean.class);
		System.out.println(bean);
		GlassBean tBean = applicationContext.getBean(GlassBean.class);
		System.out.println(tBean);
	}

}
