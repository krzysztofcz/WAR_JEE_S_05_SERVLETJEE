package pl.coderslab;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet26
 */
@WebServlet("/Servlet26")
public class Servlet26 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet26() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String[] userAgent = request.getHeader("User-Agent").split(" ");

		response.getWriter().append("\n Użytkownik używa przeglądarki: \n").append("<br>");
		for (int i=0;i<userAgent.length;i++) {
			if(userAgent[i].contains("Chrome")){
				response.getWriter().append(" - Chrome\n");
				response.getWriter().println("<br/>");
			}
			if(userAgent[i].contains("Mozilla")){
				response.getWriter().append("- Firefox\n");
				response.getWriter().println("<br/>");
			}
			if(userAgent[i].contains("Opera")){
				response.getWriter().append("- Opera\n");
				response.getWriter().println("<br/>");
			}
			if(userAgent[i].contains("Safari")){
				response.getWriter().append("- Safari\n");
				response.getWriter().println("<br/>");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
