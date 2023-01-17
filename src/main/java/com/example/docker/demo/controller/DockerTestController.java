package com.example.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker")
public class DockerTestController {

	@GetMapping(value="/test")
	public String testDocker() {
		return "Docker Testing.....";
	}
}
