package com.johnjw.mud.feature.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@MessageMapping("/send/message")
    public void message(@RequestParam("message") String message) {
        
    }
	
}
