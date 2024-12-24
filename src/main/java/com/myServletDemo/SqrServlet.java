package com.myServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
			
//		int k=(int) req.getAttribute("k");   // this for RequestDispatcher()    .... getAttribute()
	
		int k=Integer.parseInt(req.getParameter("k"));  // this is for sendRedirect()   ... getparameter()
		
		k=k*k;
				
		PrintWriter out= res.getWriter();
		out.println("Square of k is: "+k);	
				
		System.out.println("Sqr called");
	}
	

}
