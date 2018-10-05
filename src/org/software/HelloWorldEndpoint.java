package org.software;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@ServerEndpoint("/hello")

public class HelloWorldEndpoint { 
	@OnMessage public String myOnMessage(String message) {
		System.out.println("Received : "+ message); return message;
		}
	@OnOpen public void myOnOpen(Session session) {
		System.out.println("WebSocket opened: " + session.getId()); 
		
	}
	@OnClose public void myOnClose(CloseReason reason) {
		System.out.println("Closing a WebSocket due to " + reason.getReasonPhrase());
		}
	}
