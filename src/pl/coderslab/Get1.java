package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get1
 */
@WebServlet("/Get1")
public class Get1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer writer=response.getWriter();
		try {
			int start = Integer.parseInt(request.getParameter("start"));
			int end = Integer.parseInt(request.getParameter("end"));
			if (start>end) throw new Exception("Start wiekszy niz End"); 
			System.out.println(start);
			System.out.println(end);
			for(int i=start;i<=end;i++) {
				writer.append(Integer.toString(i)).append(" ");
			}

		} catch (Exception e) {
			// TODO: handle exception
			writer.append("Brak przesłanych zmiennych.");
			writer.append( e.getMessage() );
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
