package com.whackon.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台-通用文件类</b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DataCommonsStarter {
	public static void main(String[] args) {
		SpringApplication.run(DataCommonsStarter.class, args);
	}
}
