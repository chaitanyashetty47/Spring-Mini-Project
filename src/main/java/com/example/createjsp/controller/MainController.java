package com.example.createjsp.controller;
import com.example.createjsp.model.Canteen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import org.springframework.ui.Model;


@Controller
public class MainController {
	
	@Autowired
	private CanteenRepository repo;
//    private LibraryService_59 libraryService;
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("hello i am home");
		return "home";
	}
	
	@RequestMapping("/updateOrders")
	public String goToupdateBooks()
	{
		System.out.println("Orders Are Updated");
		return "updateOrders";
	}
	
    @PostMapping("/updateOrders")
    public String updateOrders(@RequestParam("name") String name,
                              @RequestParam("dish") String dish,
                              @RequestParam("price") Integer price,
                              @RequestParam("section") String section) {
    	Canteen a = new Canteen(name,dish,price,section);
    	repo.save(a);

        return "redirect:/home";
    }
    

	
	@PostMapping("/rework")
	public String rework() {
		System.out.println("Data has been updated");
		return "redirect:/updateOrders";
		
	}




	
}
