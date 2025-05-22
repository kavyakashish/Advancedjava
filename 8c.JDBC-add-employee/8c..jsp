<%@ page import="java.sql.*" %>
<html>
<body>
  <h2>Insert Employee</h2>
  <form method="post" action="insert.jsp">
    Emp No: <input type="text" name="empno" /><br/>
    Name: <input type="text" name="empname" /><br/>
    Salary: <input type="text" name="salary" /><br/>
    <input type="submit" value="Submit"/>
  </form>

<%
  String empno = request.getParameter("empno");
  String empname = request.getParameter("empname");
  String salary = request.getParameter("salary");

  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC",
      "root",
      "NewPassword@123"
    );

    // If form data is present, insert new record
    if (empno != null && empname != null && salary != null &&
        !empno.isEmpty() && !empname.isEmpty() && !salary.isEmpty()) {
      
      PreparedStatement ps = con.prepareStatement(
        "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)"
      );
      ps.setInt(1, Integer.parseInt(empno));
      ps.setString(2, empname);
      ps.setInt(3, Integer.parseInt(salary));
      ps.executeUpdate();

      out.println("<p><strong>Record inserted successfully.</strong></p>");
    }

    // Now display all records
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    out.println("<h3>All Employee Records:</h3>");
    out.println("<table border='1'>");
    out.println("<tr><th>Emp No</th><th>Name</th><th>Salary</th></tr>");

    while (rs.next()) {
      out.println("<tr>");
      out.println("<td>" + rs.getInt("Emp_NO") + "</td>");
      out.println("<td>" + rs.getString("Emp_Name") + "</td>");
      out.println("<td>" + rs.getInt("Basicsalary") + "</td>");
      out.println("</tr>");
    }
    out.println("</table>");

    con.close();
  } catch (Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
  }
%>
</body>
</html>
