<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%
String driverName="com.mysql.jdbc.driver";
String id=request.getParameter("ID");
String name =request.getParameter("name");
String price=request.getParameter("price");
try{
	Class.forName(driverName);
}
catch(ClassNotFoundException e){
	e.printStackTrace();
}
Connection connection=null;
Statement statement = null;
ResultSet resultset=null;
%>
<tr>
<td><b>ID</b></td>
<td><b>name</b></td>
<td><b>price</b></td>
</tr>
<%
try{
	connection=Drivermanager.getConnection(connectionUrl+dbName,ID, price,name);
	statement =connection.createStatement();
	String sql="select*from eproduct";
	resultSet=statement.executeQuery(sql);
	while(resultSet.next()){
		%>
		<tr>
		<td><%=resultSet.getString("ID") %></td>
		<td><%=resultSet.getString("name") %></td>
		<td><%=resultSet.getString("price") %></td>
		</tr>
		<%
		{
	connection.close();
		}
	catch(Exception e)
  {
		e.printStackTrace();
		
		%>
	}
	
}
%>
</table>
</body>
</html>