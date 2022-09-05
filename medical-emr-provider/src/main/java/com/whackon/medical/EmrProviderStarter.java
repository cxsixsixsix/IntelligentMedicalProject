package com.whackon.medical;

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
@MapperScan("com.whackon.medical.emr.*.mapper")
public class EmrProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrProviderStarter.class,args)

	}
}
