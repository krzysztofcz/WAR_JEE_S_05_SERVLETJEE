package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post3
 */
@WebServlet("/Post3")
public class Post3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer writer = response.getWriter();
		response.setContentType("text/html");
		float a = Float.parseFloat(request.getParameter("a"));
		float b = Float.parseFloat(request.getParameter("b"));
		float c = Float.parseFloat(request.getParameter("c"));
		float delta=b*b-4*a*c;
		if(delta<0) {
			writer.append("Delta is less than 0<br>There is no real roots. Rather, there are two distinct (non-real) complex roots.");			
		} else if (delta==0) {
			writer.append("One (double) real root x<sub>1</sub> = x<sub>2</sub> = "+(-b/2*a)+".");
		} else {
			writer.append("Two distinct roots: x<sub>1</sub> = "+((-b-Math.pow(delta, 1/2))/(2*a)) +",");
			writer.append(" x<sub>2</sub> = "+((-b+Math.pow(delta, 1/2))/(2*a)) +".");
		}
		
	}

}
