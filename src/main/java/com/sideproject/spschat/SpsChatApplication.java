package com.sideproject.spschat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpsChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsChatApplication.class, args);
	}
	@GetMapping("/chat/info")
    public String info(@Value("${server.port}") String port) {
        return "this is chat";
    }

}
