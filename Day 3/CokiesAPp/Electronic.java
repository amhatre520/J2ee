package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Electronic")
public class Electronic extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p1 = request.getParameter("iron");
		String p2 = request.getParameter("fan");
		
		if(p1!=null) {
			Cookie c = new Cookie("fan", p1);
			response.addCookie(c);
		}
		if(p2!=null) {
			Cookie c = new Cookie("fan", p2);
			response.addCookie(c);
		}
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action='HomeApplience' >");
		out.print("<input type='checkbox' name='mobile' value='MOBILE' >MOBILE<br>");
		out.print("<input type='checkbox' name='pc' value='PC' >PC<br>");
		out.print("<input type='submit' value='Next' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
