package com.amdocs.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myproject {
	@GetMapping("/push")
	public String showget() {
		return "Command to push file on Docker is: docker push username/imagename";
	}
	
	@GetMapping("/pull")
	public String showget1() {
		return "Command to pull file on Docker is: docker pull username/imagename";
	}
	
	@GetMapping("/tag")
	public String showget2() {
		return "Command to tag file on Docker is: docker tag imagename:latest username/imagename";
	}
	
	@GetMapping("/run")
	public String showget3() {
		return "Command to run file on Docker is: docker run -p portno:portno username/imagename";
	}
}