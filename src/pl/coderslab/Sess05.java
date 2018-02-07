package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sess05
 */
@WebServlet("/Sess05")
public class Sess05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess05() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer wr = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		wr.append("<form action='Sess05' method='POST'>");
		wr.append("<input name=\"name\" type=\"text\" placeholder=\"Name\"/>");
		wr.append("<input name=\"surname\" type=\"text\" placeholder=\"Surname\"/>");
		wr.append("<input name=\"email\" type=\"text\" placeholder=\"Email\"/>");
		wr.append("<input name=\"captch\" type=\"number\" placeholder=\"captcha\"/>");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
