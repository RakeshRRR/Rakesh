package com.java.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set up data base connections variable
		
		String user ="springstudent";
		String pass ="springstudent";
		String jdbcURL ="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver ="com.mysql.jdbc.Driver";
		
		//get connection to database
		
		try{
			
			PrintWriter out= response.getWriter();
			out.println("connecting to data base"+jdbcURL);
			Class.forName(driver);
			
			
			Connection myConn= (Connection) DriverManager.getConnection(jdbcURL, user, pass);
			
			out.println("connection successfull");
			myConn.close();
			
		}catch(Exception exe){
			exe.printStackTrace();
			throw new ServletException(exe);
			
		}
	}

}
