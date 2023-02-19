package thuchanh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TinhBMI
 */
@WebServlet("/TinhBMI")
public class TinhBMI extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");

	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>BMI</title></head>");
	    out.println("<body>");
	    out.println("<h1>BMI</h1>");
	    out.println("<form method=\"post\">");
	    out.println("CanNang (kg): <input type=\"text\" name=\"cn\"><br>");
	    out.println("ChieuCao(cm): <input type=\"text\" name=\"cc\"><br>");
	    out.println("<input type=\"submit\" value=\"BMI\">");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
	  }
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    response.setContentType("text/html");

		    PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<head><title> KET QUA BMI</title></head>");
		    out.println("<body>");
		    out.println("<h1> KET QUA BMI</h1>");

		    String wString = request.getParameter("cn");
		    String hString = request.getParameter("cc");

		    if (wString != null && hString != null) {
		      double cn = Double.parseDouble(wString);
		      double cc = Double.parseDouble(hString) / 100;
		      double bmi = cn / (cc * cc);

		      out.println("Chi so BMI cua ban la : " + bmi + "<br>");

		      if (bmi < 18.5) {
		        out.println("Gay");
		      } else if (bmi < 25) {
		        out.println("Binh thuong");
		      } else if (bmi < 30) {
		        out.println("Thua can");
		      } else {
		        out.println("Beo Phi");
		      }
		    } else {
		      out.println("Nhap CN va CC");
		    }

		    out.println("</body>");
		    out.println("</html>");
		  }
	
	
}
