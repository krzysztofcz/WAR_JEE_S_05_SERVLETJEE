package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post4
 */
@WebServlet("/Post4")
public class Post4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer writer=response.getWriter();
		writer.append("<p></p>");
//		int numbers=Integer.parseInt(request.getParameter("numbers"));
		Random rand = new Random();
		int many = (rand.nextInt(5)+5);
		writer.append("<form action=\"\" method=\"post\">");
		for(int i=0;i<many;i++) {
			writer.append("<input name=\"numbers\"><br/>");
		}
		writer.append("<input type=\"submit\"/>");
		writer.append("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer writer=response.getWriter();
		writer.append("<p></p>");
		String[] strNumbers=request.getParameterValues("numbers");
		List<Integer> intNumbers= new ArrayList<Integer>();
		
		for(int i=0;i<strNumbers.length;i++) {
			try {
				intNumbers.add(Integer.parseInt(strNumbers[i]));
			} catch (Exception e){
				e.getMessage();
			}
		}
		Collections.sort(intNumbers);
		for( Integer number : intNumbers ) {
			writer.append(number+"<br>");
		}
		
	}

}
