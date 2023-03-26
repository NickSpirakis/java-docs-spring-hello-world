package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

'''

 extends HttpServlet
 
	@RequestMapping("/num")
		int num = Integer.parseInt(req.getParameter('num'));
		
		System.out.println("Your number is: " + num);
	}
'''
'''
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
		public String showNumber(@PathVariable("num") String num, Model model)
		{ 
			model.addAttribute("num", num); 
			return "number is: " + num;
		}
'''