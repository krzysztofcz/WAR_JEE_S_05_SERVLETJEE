package pl.coderslab;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get3
 */
@WebServlet("/Get3")
public class Get3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer writer = response.getWriter();
//		W projekcie stwórz servlet Get3, który ma pobierać dwie zmienne o nazwach 
//		width i height. Jeżeli informacje nie są przesłane to 
//		width = 5 i height = 10.
//		Następnie wygeneruj tabliczkę mnożenia o podanej wysokości i 
//		szerokości i wyświetl ją w przeglądarce.
		try {
			int width = Integer.parseInt(request.getParameter("width"));
			int height = Integer.parseInt(request.getParameter("height"));
						
			for (int i=1;i<=height;i++) {
				writer.append("<p>");
				for (int j=1;j<=width;j++) {
					writer.append(String.valueOf((i*j))).append(" ");
				}
				writer.append("</p>");
			}
			
		} catch (Exception e) {
			
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
