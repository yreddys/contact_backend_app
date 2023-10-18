package com.example.DockerImges.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dImge {
	@GetMapping("/get")
	String getDt() {
		return "Hello gouse";
	}
}
