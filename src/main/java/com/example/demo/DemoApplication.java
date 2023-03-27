package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

@SpringBootApplication
@RestController
public class DemoApplication extends HttpServlet{

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);

	}	

	@RequestMapping("/test")
	String sayHello() {
    	return "Test!";
}
}
