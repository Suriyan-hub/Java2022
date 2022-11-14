package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 

import java.io.IOException;
import java.util.ArrayList;

import DAO.RegisterDao;
import bean.Bean;






/**
 * Servlet implementation class LoginServlet
 * @param <HttpSession>
 */
@WebServlet("/ControllerLogic")
public class ControllerLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		RegisterDao rdao=new RegisterDao();
		System.out.println("action: "+action);
		HttpSession sobj=request.getSession();
		if(action.equals("log"))
		{
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String id=request.getParameter("id");
		System.out.println(id);
		Bean b=new Bean();
		b.setUname(user);
		b.setPassword(pass);
		
		String s=rdao.loginUser(b);
		
			if(s.equals("success"))
			{
				
				sobj.setAttribute("name", user);
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
				
			}
			else
			{
			response.sendRedirect("error.jsp");
			}
		}
		if(action.equals("reg"))
		{
			
			String user=request.getParameter("uname");
			String pass=request.getParameter("pass");
			String email=request.getParameter("email");
			String phone=request.getParameter("phno");
			Bean b=new Bean();
			b.setUname(user);
			b.setPassword(pass);
			b.setEmail(email);
			b.setPhone(phone);
			String n=rdao.regUser(b);
			System.out.println("regUser : " +n);
			if(n.equals("success"))
			{
				//ArrayList<Bean> arb=rdao.viewUser();
				//sobj.setAttribute("ulist", arb);
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
			
		}
	}

}
