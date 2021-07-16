package com.lg.lgapp;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lg.lgapp.bean.RemoteBean;
import com.lg.lgapp.bean.TvBean;

public class TvTester {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		TvBean bean = applicationContext.getBean(TvBean.class);
		System.out.println(bean.getId());
		RemoteBean remoteBean=applicationContext.getBean(RemoteBean.class);
		System.out.println(remoteBean.getNoOfButtons());
		System.out.println(remoteBean);
		
	}
}
