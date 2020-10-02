<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
table, th, td {
border: 1px solid #000080;
font-size:30px;
background-color:white;
font-color:#000080;
}
th, td {
  padding: 5px;
}
.center {
  margin-left: auto;
  margin-right: auto;
}
body{
background-color:#40E0D0;
}
</style>
</head>
<body>
<h1 style="text-align:center; color:#000080"> Welcome, ${username}</h1>
<h2 style="text-align:center; color:#000080"> Here is your product list from walmart </h2>
</br>	
<table class="center" style="width:80%">
<tr>
    <th style="color: #000080;">Product name</th>
    <th style="color: #000080;">Date of Purchase</th>
    <th style="color: #000080;">Date of Expiry</th>
    <th style="color: #000080;">Days remaining</th>
  </tr>
 <c:forEach items="${data}" var="current">
        <tr>
       	<td style="color: #000080;"><c:out value="${current.getProducts()}" /></td>
         <td style="color: #000080;"><c:out value="${current.getPurchase_date()}" /></td>
		 <td style="color: #000080;"><c:out value="${current.getSelling_date()}" /></td>
		 <td style="color: #000080;"><c:out value="${current.getDays()}" /></td>
        </tr>
      </c:forEach>
</table>
</body>
</html>