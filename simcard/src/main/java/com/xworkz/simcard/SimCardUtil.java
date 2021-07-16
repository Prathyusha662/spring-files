package com.xworkz.simcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.simcard.bean.SimCardBean;

public class SimCardUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		SimCardBean bean = applicationContext.getBean(SimCardBean.class);
		System.out.println(bean);
		System.out.println(bean.getId() + " " + bean.getHeadArea());
		SimCardBean bean1 = applicationContext.getBean(SimCardBean.class);
		System.out.println(bean1);
		System.out.println(bean.getName() + " " + bean.getRevenue());

	}

}
