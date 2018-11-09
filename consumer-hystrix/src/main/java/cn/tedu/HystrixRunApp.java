package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients 			//开启Feign
@EnableCircuitBreaker	
public class HystrixRunApp {
	public static void main(String[] args) {
        SpringApplication.run(HystrixRunApp.class, args);
    }
}
