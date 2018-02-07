package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie6
 */
@WebServlet("/Cookie6")
public class Cookie6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie6() {
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
		Writer writer=response.getWriter();
		response.setContentType("text/html");
		String textColor=request.getParameter("textColor");
		String backgroundColor=request.getParameter("backgroundColor");
		Cookie ciastkoTC = new Cookie("textColor", textColor);
		Cookie ciastkoBGC = new Cookie("backgroundColor", backgroundColor);
		response.addCookie(ciastkoTC);
		response.addCookie(ciastkoBGC);
		writer.append("Wybrałeś kolor tekstu jako: "+textColor+", oraz tła jako: "+backgroundColor+". Twój wybór został zapisane w ciasteczku.");
		
	}

}
