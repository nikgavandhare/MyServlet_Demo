package com.myServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqrServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
			
//		int k=(int) req.getAttribute("k");   // this for RequestDispatcher()    .... getAttribute()
	
//		int k=Integer.parseInt(req.getParameter("k"));  // this is for sendRedirect()   ... getparameter()
		
		HttpSession session=req.getSession();       // this is using Httpsession()    .... getAttribute()
		int k = (int) session.getAttribute("k");
		k=k*k;
				
		PrintWriter out= res.getWriter();
		out.println("Square of k is: "+k);	
				
		System.out.println("Sqr called");
	}
	

}
