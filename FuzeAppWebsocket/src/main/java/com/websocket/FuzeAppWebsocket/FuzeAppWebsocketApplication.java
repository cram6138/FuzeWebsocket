package com.websocket.FuzeAppWebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FuzeAppWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuzeAppWebsocketApplication.class, args);
		System.out.println("FuzeAppWebsocket Application Started");
	}

}
