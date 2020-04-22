package com.websocket.FuzeAppWebsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FuzeAppWebsocketController {


	@MessageMapping("/info")
	@SendTo("/project/data")
	public String greeting(String message) throws Exception {
		return "Site Project Info";
	}

}
