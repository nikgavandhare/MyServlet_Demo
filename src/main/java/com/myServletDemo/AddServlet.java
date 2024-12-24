package com.myServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet  extends HttpServlet
{

		// create service() method it is special method defined already in servlent
		public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
		{
			// her req is for passing values and resposnse to give result 
			int i =Integer.parseInt( req.getParameter("num1"));      // here getparameter(String) method is string type
												//but we are passing in so convet it into int using Integer.parseInt() method
			
			int j =Integer.parseInt(req.getParameter("num2"));
			
							// add i+j 
		   int k=i+j;
							//System.out.println("Addition is:"+" "+ k);  //sysout will show result in only consol but we want it to show inn browser
							// thats why use method called " res.getWriter.println();  "
							
							//res.getWriter().println("Addition is:"+" "+ k);
							
//			PrintWriter out= res.getWriter();
			
							// every time use out instead of res.getwriter()
			
//			out.println("Addition is:"+" "+ k);
			
			
			//square of k
			req.setAttribute("k",k);
			RequestDispatcher rd =req.getRequestDispatcher("Sqr");
			rd.forward(req, res);
			
		}
	

}  