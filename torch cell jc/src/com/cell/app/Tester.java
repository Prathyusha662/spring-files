package com.cell.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cell.app.bean.CellBean;
import com.cell.app.bean.TorchBean;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		TorchBean bean = applicationContext.getBean(TorchBean.class);
		System.out.println(bean.getId());
		CellBean remoteBean = applicationContext.getBean(CellBean.class);
		System.out.println(remoteBean);
	}

}
