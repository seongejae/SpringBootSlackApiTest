package com.mycom.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.myapp.service.SlackApiService;

@RestController
public class SlackApiController {
	
	private final SlackApiService slackApiService;
	
	// 생성자 DI
	public SlackApiController(SlackApiService slackApiService) {
		this.slackApiService = slackApiService;
	}
	
	// get
	@GetMapping("/notify")
	public String sendSlackNotification() {
		slackApiService.sendMessage("🔔 SpringBootSlackApiTest App 메세지를 전송했습니다.");
		
		return "Slack 에 Message 를 보냈습니다.";
	}
}
