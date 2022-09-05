package com.whackon.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * <b>智能医疗信息平台-门诊功能-provider启动类</b>
 *
 * @author qck
 * @date 2022/8/25
 */
@MapperScan("com.whackon.medical.clinic.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ClinicProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicProviderStarter.class, args);
	}
}
