package com.example.demo;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller    //request and response from web
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Hey Guys!");
		return "Home";
	}
}