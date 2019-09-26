package online_tour;

import java.io.IOException;

@WebServlet("/SaveServlet")
public class SaveServlet<HttpServletResponse, HttpServletRequest> extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public SaveServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
