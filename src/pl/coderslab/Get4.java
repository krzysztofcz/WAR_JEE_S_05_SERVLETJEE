package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get4
 */
@WebServlet("/Get4")
public class Get4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		W projekcie stwórz servlet Get4, dostępny pod adresem /Get4, oraz stronę HTML index.html, w której zawarty jest formularz przesyłany metodą GET z jednym polem page.
		Po uruchomieniu aplikacji na serwerze, uzupełnieniu i zatwierdzeniu formularza w przeglądarce wyświetli się informacja czy wartość została przesłana oraz wyświetlone zostaną dzielniki całkowite przesłanej liczby.

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
