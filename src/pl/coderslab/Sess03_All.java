package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_All
 */
@WebServlet("/Sess03_All")
public class Sess03_All extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess03_All() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		która wyświetli w formie tabeli wszystkie dane znajdujące się w sesji (zarówno klucz jak i wartość)
		HttpSession sess = request.getSession();
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		Writer wr = response.getWriter();
		Map<String,String> keyAndValues= new HashMap<String,String>();
		
		Enumeration<String> mySession = sess.getAttributeNames();
			while (mySession.hasMoreElements()) {
				String key = (String) mySession.nextElement();
				String value = (String) sess.getAttribute(key);
				keyAndValues.put(key, value);
			}
			Set<String> allKeys=keyAndValues.keySet();
//			CODE BELLOW FROMM http://www.techiedelight.com/convert-set-string-array-string/
			String[] allKeysStrings = allKeys.stream().toArray(String[]::new);
		for (String key : allKeysStrings) {
			wr.append("KEY: "+key).append(" , VALUE: ").append(keyAndValues.get(key)).append("<br>");
//			wr.append("KEY: "+kav.split(" ")[0]).append(" , VALUE: ").append(kav.split(" ")[1]).append("<br>");
		}
		wr.append("allkeys : ").append(allKeys.toString()).append("<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
