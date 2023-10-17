package com.example.createjsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.example.createjsp.controller.MainController;
import com.example.createjsp.model.Canteen;

import com.example.createjsp.controller.*;

public class FoodSearch extends HttpServlet {
	public static String foodDatas = "getFoodData";
	private MainController mainController;
	
	
	@Autowired
	public FoodSearch(MainController mainController) {
	    this.mainController = mainController;
	}
	


    
//    public BookSearch(MainController mController) {
//    	this.mController = mController;
//    }
    
    


    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String method = req.getMethod();

    	

    }
    
    

}
