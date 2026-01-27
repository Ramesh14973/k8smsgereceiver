package com.k8smsgereceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8smsgereceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8smsgereceiverApplication.class, args);
	}

}
