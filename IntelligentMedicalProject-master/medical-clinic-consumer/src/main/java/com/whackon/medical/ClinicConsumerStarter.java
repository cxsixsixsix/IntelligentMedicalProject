package com.whackon.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * <b>智能医疗信息平台-门诊功能-consumer启动类</b>
 *
 * @author qck
 * @date 2022/8/25
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ClinicConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicConsumerStarter.class, args);

	}
}
