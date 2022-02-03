import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;


public class SignUp extends HttpServlet {
  
  //Process the HTTP Get request
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
	response.setContentType("text/html");
    
	// get PrintWriter object
	PrintWriter out = response.getWriter();

    String firstName=request.getParameter("firstName");
    String lastName=request.getParameter("lastName");
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    String phoneNumber=request.getParameter("phoneNumber");
    String Address=request.getParameter("Address");
    String Gender=request.getParameter("Gender");
    String dateOfBirth=request.getParameter("dateOfBirth");

    out.println("<html>");
    out.println("<head><title>Response</title></head>");
    out.println("<body bgcolor=\"#ffffff\">");

    out.println("<p>"+firstName+"</p>");


    try{

    Class.forName("com.mysql.jdbc.Driver");

    String url = "jdbc:mysql://127.0.0.1/webengineering1";

    Connection con=DriverManager.getConnection(url, "root", "");

    Statement st=con.createStatement();

     
     String query = "INSERT INTO users(firstName,lastName,email,password,phoneNumber,Address,Gender,dateOfBirth)VALUES('"+ firstName + "','" + lastName+ "','"+email+"','"+password+"','"+phoneNumber+"','"+Address+"','"+Gender+"','"+dateOfBirth+"') ";
     out.println("<p>"+query+"</p>");

     System.out.println(query);

      int rs = st.executeUpdate( query );

     if(rs==1){	out.println("<h1>Insertion successful</h1>"); 		}
	else{	out.println("<h1>Record could not be inserted.</h1>"); 		}

     out.println("</body></html>");

           st.close();
           con.close();

    }catch(Exception e){

      out.println(e);
    }

  }

}
