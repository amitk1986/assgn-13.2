package com.diablo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.diablo.dao.StudentDaoImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDaoImpl st = (StudentDaoImpl)ctx.getBean("dao");
    	st.getStudent();

	}

}
