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
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Writer wr =response.getWriter();
		Cookie[] ciastka = request.getCookies();
		String remTextColor = null;
		String remBackGroundColor = null;
		for ( Cookie ciastko : ciastka) {
			if( ciastko.getName().equals("textColor")) {
				remTextColor = ciastko.getValue() ;
			} else if (ciastko.getName().equals("backgroundColor")) {
				remBackGroundColor = ciastko.getValue() ;
			}
		}
		if(remTextColor!=null && remBackGroundColor!=null) {
			wr.append("Zapamiętany w ciasteczku kolor tekstu to: "+remTextColor+", oraz tła jako: "+remBackGroundColor+" .");
		}
		if(remTextColor==null && remBackGroundColor==null) {
			response.sendRedirect("index_6.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Writer writer=response.getWriter();
		String textColor=request.getParameter("textColor");
		String backgroundColor=request.getParameter("backgroundColor");
		Cookie ciastkoTC = new Cookie("textColor", textColor);
		Cookie ciastkoBGC = new Cookie("backgroundColor", backgroundColor);
		ciastkoTC.setMaxAge(3600*2);
		ciastkoBGC.setMaxAge(3600*2);
		response.addCookie(ciastkoTC);
		response.addCookie(ciastkoBGC);
		writer.append("Wybrałeś kolor tekstu jako: "+textColor+", oraz tła jako: "+backgroundColor+". Twój wybór został zapisane w ciasteczku.");
		
	}

}
