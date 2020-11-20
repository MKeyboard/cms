package com.cmschina.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("LOCAL_IP", InetAddress.getLocalHost().getHostAddress());
        SpringApplication.run(ConfigApplication.class, args);
    }

}
