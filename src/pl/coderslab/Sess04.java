package pl.coderslab;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess04
 */
@WebServlet("/Sess04")
public class Sess04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		sess.setMaxInactiveInterval(86400);
		ArrayList<Product> products = (ArrayList<Product>) sess.getAttribute("products");
		
		Writer wr = response.getWriter();
		
		double totalValue = 0;
		
		wr.append("<ul>");
			for(Product p: products) {
				double elemValue = p.getQuantity()*p.getPrice();
				totalValue +=elemValue;
				
				wr.append("<li>")
				  .append(p.getName())
				  .append(" - ")
				  .append( Double.toString(p.getQuantity()) )
				  .append(" x ")
				  .append( Double.toString(p.getPrice()) )
				  .append(" = ")
				  .append( Double.toString( elemValue ))
				  .append("</li>")
				  ;
			}
		
		wr.append("</ul>");
		wr.append("Sum: ").append( Double.toString(totalValue));
		
		response.setContentType("text/html");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get Form data
		String name = request.getParameter("name");
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		//New Procuct
		Product product = new Product(name, quantity, price);
		
		HttpSession sess = request.getSession();
		sess.setMaxInactiveInterval(86400);
		
		ArrayList<Product> products = (ArrayList<Product>) sess.getAttribute("products");
		
		if(products==null) {
			products = new ArrayList<>();
		}
		
		products.add(product);
		sess.setAttribute("products", products);
		
		response.getWriter().append("Added. Total: ").append( Integer.toString( products.size() ) );
		
//		response.sendRedirect("Sess04");
		doGet(request, response);
		
		
	}

}
