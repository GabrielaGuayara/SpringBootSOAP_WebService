package com.perscholas.SpringSoapDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.perscholas.SpringSoapDemo", "SoapWebServices", "com.perscholas.xml.book"})
public class SpringSoapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapDemoApplication.class, args);
	}

}
