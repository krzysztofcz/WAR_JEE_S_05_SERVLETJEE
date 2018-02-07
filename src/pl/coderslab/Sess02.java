package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess02
 */
@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer wr = response.getWriter();
		
		wr.append("<form action='' method='post'><input name='degree' type='number' placeholder='degree'/><input type='submit'/></form>");
		response.setContentType("text/html");
		
		HttpSession sess = request.getSession();
		sess.setMaxInactiveInterval(82600);
		
		wr.append( sess.getId() );
		
		
		
//		System.out.println( degrees.size() );
//		
//		wr.append("<ul>");
//		for(int degree : degrees) {
//			wr.append("<li>").append(Integer.toString(degree)).append("</li>");
//		}
//		
//		wr.append("</ul>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer wr = response.getWriter();
		HttpSession sess = request.getSession();
		
		try {
			
			sess.setMaxInactiveInterval(82600);
			
			wr.append( sess.getId() ).append("<br>");
			
			Integer[] degrees = (Integer[]) sess.getAttribute("degrees");
			
			if( degrees == null) {
				wr.append("IS NULL :( ");
				degrees = new Integer[0];
			}
			
			//get degree from form
			int degree =  Integer.parseInt(request.getParameter("degree") );
			
			if(degree>=1 && degree<=6) {
				Integer[] newDegrees = Arrays.copyOf(degrees, degrees.length+1);
				newDegrees[degrees.length] = degree;
				
				
				System.out.println(sess.getAttribute("degrees").toString());
				wr.append("Added ")
					.append(Integer.toString(degree))
					.append(" Total count")
					.append( Integer.toString( newDegrees.length ));
			}else {
				wr.append("Degree must be between 1 and 6");
			}
			
		}catch (Exception e) {
			wr.append(e.getMessage());
		}
		
//		doGet(request, response);
		
		
	}

}
