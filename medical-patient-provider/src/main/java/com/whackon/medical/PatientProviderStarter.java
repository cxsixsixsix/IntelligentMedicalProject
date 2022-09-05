package com.whackon.medical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b></b>
 *
 * @author Qt
 * @date 2022/8/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.whackon.medical.patient.*.mapper")
public class PatientProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(PatientProviderStarter.class,args);
	}
}
