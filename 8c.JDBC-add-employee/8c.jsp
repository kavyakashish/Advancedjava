<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Salary Report</h2>
<%
  int total = 0;
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "NewPassword@123");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
      int eno = rs.getInt("Emp_NO");
      String ename = rs.getString("Emp_Name");
      int basic = rs.getInt("Basicsalary");
      total += basic;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<br/>Emp_No : <%= eno %>
<br/>Emp_Name : <%= ename %>
<br/>Basic : <%= basic %><br/>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
<%
    }
%>
<br/><strong>Grand Salary: <%= total %></strong><br/>
<%
    con.close();
  } catch (Exception e) {
    out.println("Error: " + e.getMessage());
  }
%>
</body>
</html>
