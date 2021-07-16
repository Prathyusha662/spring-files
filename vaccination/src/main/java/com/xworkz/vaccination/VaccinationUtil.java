package com.xworkz.vaccination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vaccination.bean.VaccinationBean;

public class VaccinationUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		VaccinationBean bean = applicationContext.getBean(VaccinationBean.class);
		System.out.println(bean);
		System.out.println(bean.getAge()+" "+bean.getDosesAvaliabe()+" "+bean.getId());
		VaccinationBean bean1 = applicationContext.getBean(VaccinationBean.class);
		System.out.println(bean1);
		System.out.println(bean.getName()+" "+bean.getDosesSent());

	}

}
