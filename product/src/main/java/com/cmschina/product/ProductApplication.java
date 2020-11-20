package com.cmschina.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("LOCAL_IP", InetAddress.getLocalHost().getHostAddress());
        System.setProperty("sysID","FM1314");
        SpringApplication.run(ProductApplication.class, args);
    }

}
