package com.whackon.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智能医疗平台 - 患者功能 - Consumer 启动类</b>
 *
 * @author Qt
 * @date 2022/8/25
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class PatientConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(PatientConsumerStarter.class,args);
	}
}
