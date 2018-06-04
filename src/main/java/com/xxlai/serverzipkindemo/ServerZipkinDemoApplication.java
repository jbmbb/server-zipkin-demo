package com.xxlai.serverzipkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class ServerZipkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkinDemoApplication.class, args);
	}
}
