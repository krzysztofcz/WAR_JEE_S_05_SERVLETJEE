package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get62
 */
@WebServlet("/Get62")
public class Get62 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get62() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Writer writer=response.getWriter();
		writer.append("<p></p>");
		int year=Integer.parseInt(request.getParameter("year"));
		Random rand = new Random();
		int mix;
		for(int i=0;i<5;i++) {
			mix = (rand.nextInt(21)-10);
			writer.append("<a href=\"Get63?year="+year+"&mix="+mix+"\"> Year : "+year+", mix "+mix+" </a></br>");
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
