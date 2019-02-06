package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zhuravlev Evgeniy
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<html>\n"
                + "<head>\n"
                + "     <title> Hello servlet </title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<table border=\"1\">\n"
                + "     <tr>\n"
                + "         <td>ID</td>\n"
                + "         <td>Last name</td>\n"
                + "     </tr>\n"
                + "     <tr>\n"
                + "         <td>1</td>\n"
                + "         <td>Ivanov</td>\n"
                + "     </tr>\n"
                + "     <tr>\n"
                + "         <td>2</td>\n"
                + "         <td>Petrov</td>\n"
                + "     </tr>\n"
                + "     <tr>\n"
                + "         <td>3</td>\n"
                + "         <td>Simonov</td>\n"
                + "     </tr>\n"
                + "</table>\n"
                + "</body>\n"
                + "</html>");
    }
}
