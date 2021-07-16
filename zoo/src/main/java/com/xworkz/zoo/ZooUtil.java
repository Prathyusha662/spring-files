package com.xworkz.zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.zoo.bean.ZooBean;

public class ZooUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		ZooBean bean = applicationContext.getBean(ZooBean.class);
		System.out.println(bean);
		System.out.println(bean.getLocation()+" "+bean.getNoOfAnimalsAvalable()+" "+bean.getId());
		ZooBean bean1 = applicationContext.getBean(ZooBean.class);
		System.out.println(bean1);
		System.out.println(bean.getName()+" "+bean.getEntryFee());

	}

}
