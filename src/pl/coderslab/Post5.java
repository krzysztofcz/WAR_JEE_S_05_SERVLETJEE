package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post5
 */
@WebServlet("/Post5")
public class Post5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post5() {
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
		String CtoF=request.getParameter("convertionType");
		float degrees = Float.parseFloat(request.getParameter("degrees"));
		if (CtoF.equalsIgnoreCase("celcToFahr")){
			writer.append("Temperatura w Celsjusza : "+degrees+" <br> a temperaturze w Fahrenheitach :"+((5*(degrees-32))/9.));
		} 
		if (CtoF.equalsIgnoreCase("FahrToCelc")) {
			writer.append("Temperatura w Fahrenheitach : "+degrees+" <br> a temperaturze w Celsjuszach :"+(32+( (9*degrees)/5. )) );
		}
	}

}
