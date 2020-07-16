import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "secondservlet")
public class secondservlet extends HttpServlet {
    static final String JDBC_DRIVER = ("com.mysql.jbc.Drivers");
    static final String URL = ("jdbc:mysql://localhost:3306/bita");
    static final String USER = " root";
    static final String PASS =" ";

    protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            Statement stm = conn.createStatement();
            String name = request.getParameter("name");
            String reg = request.getParameter("reg");
            String grade = request.getParameter("grade");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String sex = request.getParameter("sex");





            String show ="SELECT name,grade,reg FROM students";
            ResultSet sob = stm.executeQuery(show);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request,response);

    }
}
