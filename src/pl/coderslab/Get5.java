package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get5
 */
@WebServlet("/Get5")
public class Get5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Writer writer = response.getWriter();
		writer.append("<p></p>");
		Map<String,String[]> names= request.getParameterMap();
		Set<String> value = names.keySet();
		for(String key : value) {
			writer.append("<ul>");
				writer.append("<li>"+key+":</li>");
					writer.append("<ul>");
						String[] values = names.get(key);
						for ( int i=0;i<values.length;i++) {
						writer.append("<li>"+values[i]+"</li>");
						}
					writer.append("</ul>");
			writer.append("</ul>");
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
