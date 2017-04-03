package com.ducky.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ducky.model.UserDatabase;
import com.google.gson.Gson;

@WebServlet("/ReturnJSON")
public class ReturnJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ReturnJSON() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// File format to user
		//response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		Gson gsonArray = new Gson();
/*		PostDAO postDao = new PostDAO();
*/		List<UserDatabase> listUser = PostDAO.queryDatabase();
		out.print(gsonArray.toJson(listUser));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
