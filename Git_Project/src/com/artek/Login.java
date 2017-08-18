package com.artek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter=response.getWriter();
		printWriter.print(request.getParameter("unm"));
		System.out.println("request processing initiated.....");
		printWriter.println("ANKUR");
		printWriter.print("Jaiswal");
		System.out.println("loading.........");
		printWriter.println("GIt");
		System.out.println("another request...");
		System.out.println("one more request");
		System.out.println("second request.....");
		System.out.println("yet another request");
		printWriter.print(request.getParameter("upass")+"</br>"+"/n");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
