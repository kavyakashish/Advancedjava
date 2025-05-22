<%@ page import="java.sql.*" %>
<html>
<body>
  <h2>Update Employee</h2>
  <form method="post" action="update.jsp">
    Emp No: <input type="text" name="empno" /><br/>
    New Name: <input type="text" name="empname" /><br/>
    New Salary: <input type="text" name="salary" /><br/>
    <input type="submit" value="Update"/>
  </form>

<%
  String empno = request.getParameter("empno");
  String empname = request.getParameter("empname");
  String salary = request.getParameter("salary");

  if (empno != null && empname != null && salary != null) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "NewPassword@123");
      PreparedStatement ps = con.prepareStatement("UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?");
      ps.setString(1, empname);
      ps.setInt(2, Integer.parseInt(salary));
      ps.setInt(3, Integer.parseInt(empno));
      int count = ps.executeUpdate();
      if (count > 0) {
        out.println("<p>Record updated successfully.</p>");
      } else {
        out.println("<p>No record found for the given ID.</p>");
      }
      con.close();
    } catch (Exception e) {
      out.println("<p>Error: " + e.getMessage() + "</p>");
    }
  }
%>
</body>
</html>
