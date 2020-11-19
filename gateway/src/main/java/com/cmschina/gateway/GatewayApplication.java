package com.cmschina.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("LOCAL_IP", InetAddress.getLocalHost().getHostAddress());
        System.setProperty("sysID","FM1313");
        SpringApplication.run(GatewayApplication.class, args);
    }

}
