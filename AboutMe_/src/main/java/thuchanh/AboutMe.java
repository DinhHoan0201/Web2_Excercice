package thuchanh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AboutMe() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		showIntroduction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		showIntroduction(request, response);
	}
	
	  private void showIntroduction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Set the content type and character encoding
	        response.setContentType("text/html");
	        response.setCharacterEncoding("UTF-8");

	        // Get a PrintWriter object to write the HTML response
	        PrintWriter out = response.getWriter();

	        // Write the HTML response
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>My Introduction</title>");
	        out.println("<style>");
	        out.println("body { background-color: lightgray; }");
	        out.println("h1 { color: darkblue; text-align: center; }");
	        out.println("p { font-size: 18px; text-align: justify; padding: 20px; background-color: white; }");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>My Introduction</h1>");
	        out.println("<p>");
	        out.println("Hello, my name is " + request.getParameter("name") + " and I'm a " + request.getParameter("profession") + ". ");
	        out.println("I have " + request.getParameter("experience") + " years of experience in " + request.getParameter("experience_field") + ". ");
	        out.println("I'm passionate about " + request.getParameter("passion") + " and always looking for new challenges and opportunities to learn and grow. ");
	        out.println("</p>");
	        out.println("</body>");
	        out.println("</html>");

	        out.close();
	    }


}
