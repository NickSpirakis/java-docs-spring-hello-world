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
'''
	@RequestMapping(value="/getNum", method=RequestMethod.GET)
	public String getNum(@RequestParam(value="num") String num) {
		PrintWriter out = res.getWriter();
		out.println("Your number is: " + num);
		//return "Hello Azure!";
	}
'''
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
	 throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		PrintWriter out = res.getWriter();
		out.println("Your number is: " + num);
	}
	'''
	@RequestMapping(value="/getNum", method=RequestMethod.GET)
	public String getNum(Model model, @RequestParam(value="num") String num) {
		model.addAttribute("Number", num);
		return "Hello Azure!";
	}
	'''
}
