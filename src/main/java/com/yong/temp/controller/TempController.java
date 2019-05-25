package com.yong.temp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
	@GetMapping("/")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok()
			.header("Keep-Alive", "timeout=0")
			.body("hello world");
	}
}
