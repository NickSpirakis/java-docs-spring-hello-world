import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getInput {

	protected void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		PrintWriter out = res.getWriter();
		out.println("Your number is: " + num);
	}

}
