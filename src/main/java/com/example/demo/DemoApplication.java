package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication extends HttpServlet{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure!";
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletRequest res)
	throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter('num'));
		PrintWriter out = res.getWriter();
		out.println("Your number is: " + num);
	}
}
