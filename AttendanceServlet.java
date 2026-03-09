
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AttendanceServlet extends HttpServlet {

public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {

String classid = request.getParameter("class");

PrintWriter out = response.getWriter();
out.println("Attendance recorded for class: " + classid);

}
}
