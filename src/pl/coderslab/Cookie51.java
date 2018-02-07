package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie51
 */
@WebServlet("/Cookie51")
public class Cookie51 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie51() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		Writer writer = response.getWriter();
		try {
			if(request.getParameter("haveCookie").equals("no")){
				writer.append("Nie odwiedziłeś jeszcze tej strony<br>You must visit this site <a href=\"Cookie51\" >Cookie51</a> first to come here.<br>");			
			} 
		}catch (Exception e) {
			
		}
		writer.append("Now you can visit this site <a href=\"Cookie52\" > Cookie52 </a>");
		Cookie cookie = new Cookie("visited", "Cookie51");
		response.addCookie(cookie);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
