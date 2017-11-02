package com.setholmstead.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class DisplayDateApplication {
	private static final DateFormat time = new SimpleDateFormat("HH:mm:ss");
    private static final DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index() {
		System.out.println();
            return "index.jsp";
    }
	@RequestMapping("/Date")
    public String date(Model model) {
		System.out.println(date);
		model.addAttribute("time", date);
            return "date.jsp";
    }
	@RequestMapping("/Time")
    public String time(Model model) {
		System.out.println(time);
		model.addAttribute("ddate", localDate);
            return "time.jsp";
    }

}
