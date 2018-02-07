package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.security.provider.certpath.ResponderId;

/**
 * Servlet implementation class Sess03_Add
 */
@WebServlet("/addToSession")
public class Sess03_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess03_Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Writer wr = response.getWriter();
		wr.append("<form action='#' method='POST'>");
		wr.append("<label> Klucz:");
		wr.append("<input type=\"text\" name=\"key\">");
		wr.append("</label>");
		wr.append("<label> Wartość:");
		wr.append("<input type=\"text\" name=\"value\">");
		wr.append("</label>");
		wr.append("<input type=\"submit\">");
		wr.append("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//				doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Writer wr = response.getWriter();
		HttpSession sess = request.getSession();
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		wr.append("klucz : "+key+", wartosc : "+value);
		sess.setAttribute(key, value);
	    
	}

}
