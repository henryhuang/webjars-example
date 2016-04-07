package cnhalo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSample extends HttpServlet {
	
	private static final long serialVersionUID = -5041101055869552308L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		try(PrintWriter printWriter = resp.getWriter()) {
			printHTML(printWriter, "<script type='javascript' src='webjars/jquery/3.0.0-alpha1/jquery.js'></script>", "OK");
			printWriter.flush();
		}

	}
	
	private void printHTML(PrintWriter printWriter, String headContent, String bodyContent) {
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print(headContent);
		printWriter.print("</head>");
		printWriter.print("<body>");
		printWriter.print(bodyContent);
		printWriter.print("</body>");
		printWriter.print("</html>");
	}
	
}
