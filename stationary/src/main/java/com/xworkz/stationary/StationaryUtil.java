package com.xworkz.stationary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.stationary.bean.StationarBean;

public class StationaryUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		 StationarBean bean = applicationContext.getBean(StationarBean.class);
		System.out.println(bean);
		System.out.println(bean.getAddress()+" "+bean.getStationaryId());
		StationarBean bean1 = applicationContext.getBean(StationarBean.class);
		System.out.println(bean1);
		System.out.println(bean.getName()+" "+bean.getOwnerName());

	}

}
