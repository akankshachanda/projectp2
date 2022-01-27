<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="salary" scope="session" />  
<p>Your salary is : <c:out value="${salary+bonus}"/></p>  
<c:choose>  
    <c:when test="${salary > 9000 && salary < 13000 }">  
      bonus=5000 ;
      <p>Your salary is : <c:out value="${salary+bonus}"/></p>  
    </c:when>  
    <c:when test="${salary > 13500 && salary < 21000}">  
          bonus=7000 ;
      <p>Your salary is : <c:out value="${salary+bonus}"/></p>  
    </c:when>  
     <c:when test="${salary > 22000 && salary < 26000}">  
          bonus=9000 ;
      <p>Your salary is : <c:out value="${salary+bonus}"/></p> 
       </c:when> 
       <c:otherwise>  
        bonus=10000;
        <p>Your salary is : <c:out value="${salary+bonus}"/></p>
     </c:otherwise>  
</c:choose>  


</body>
</html>