package com.cmschina.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("LOCAL_IP", InetAddress.getLocalHost().getHostAddress());
        System.setProperty("sysID","FM1312");
        SpringApplication.run(EurekaApplication.class, args);
    }

}
