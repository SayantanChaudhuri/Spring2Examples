package com.sayantan.springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBeanApplication {

	@Bean
	public MyInfo myInfo() {
		return new MyInfo();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBeanApplication.class, args);

		MyInfo info = context.getBean(MyInfo.class);
		info.getMyInfo();
	}

	private class MyInfo {
		
		public void getMyInfo() {
			System.out.println("My name is Sayantan");
		}
	}
}
