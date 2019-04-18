package com.example.demo;

import com.example.service.ServiceTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@RequestMapping(value = "/test",method = RequestMethod.GET)
//	String test(){
//		ServiceTest serviceTest = new ServiceTest();
//		return serviceTest.showService()+":我是web!";
//	}
}
