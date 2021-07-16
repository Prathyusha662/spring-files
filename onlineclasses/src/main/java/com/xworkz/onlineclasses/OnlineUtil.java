package com.xworkz.onlineclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.onlineclasses.bean.OnlineClassesBean;

public class OnlineUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		OnlineClassesBean bean = applicationContext.getBean(OnlineClassesBean.class);
		System.out.println(bean);
		System.out.println(bean.getId() + " " + bean.getDuration());
		OnlineClassesBean bean1 = applicationContext.getBean(OnlineClassesBean.class);
		System.out.println(bean1);
		System.out.println(bean.getName() + " " + bean.getMeetingId());

	}

}
