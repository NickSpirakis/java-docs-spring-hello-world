package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@RequestMapping("/")
	String sayHello() {

		return "Hello Azure!";
	}

	@RequestMapping(value="/getNum", method=RequestMethod.GET)
	public String getNum(Model model, @RequestParam(value="num") String num) {
		model.addAttribute("Number", num);
		return "Hello Azure!";
	}
}
