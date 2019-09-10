package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.pool.Constants;


@WebServlet("/student.do")
public class StrudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		//String action = request.getParameter("action");
		String dest = request.getParameter("dest");
		switch(request.getParameter("action")) {
		case "move"  :
			request.getParameter("dest");
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH,"student",request.getParameter("dest"))).forward(request, response);
			   break;
		case "register": 
			request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student",request.getParameter("dest"))).forward(request, response);
				break;	   
		case "login" : 
			System.out.println(request.getParameter("dest"));
			
			//request.getRequestDispatcher(String.format("/%s.jsp",request.getParameter("dest"))).forward(request, response);
				break;	
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
