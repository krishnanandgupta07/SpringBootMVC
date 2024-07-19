<%@ page isELIgnored="false" import="java.util.*"%>
<h1 style="color: blue; text-align: center;">Welcome to Spring Boot
	MVC</h1>
<br>
<br>
<%-- <h1>Model Attributes Data is </h1> 
<b>Your fav cricketrs are::<%=Arrays.toString(((String[])request.getAttribute("favCricketers"))) %></b><br>
<b>Nick names are ::${nickNames }</b></br>
<b>Phone Numbers are ::${mobileNumber }</b></br>
<b>Ids Details are ::${idDetails }</b> --%>

<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<b> Cricketers::</b><br>
<c:forEach var="cr" items="${favCricketers}">
${cr}</br>
</c:forEach>
 <hr>
 
 <b> nickNames::</b><br>
<c:forEach var="nn" items="${nickNames}">
 ${nn} </br>
</c:forEach> 
<hr>

<b> mobileNumbers::</b><br>
<c:forEach var="mm" items="${mobileNumber}">
${mm} </br>
</c:forEach>
 <hr>
 
 <b> idDetails::</b><br>
<c:forEach var="id" items="${idDetails}">
${id}</br>
</c:forEach> 
<hr> --%>


<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Reading Model class object data::</h1>
<b> Model Attributes are :: ${touristInfo}</b>
<br>
<b> Model Attributes are :: ${touristInfo.tid},${touristInfo.tname},${touristInfo.mobileNumber},${touristInfo.budget}</b>
<br>
 --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty touristInfo }">
		<table bgcolor="yellow">
			<tr>
				<th>tid</th>
				<th>tname</th>
				<th>mobileNumber</th>
				<th>destLoccation</th>
				<th>fromLocation</th>
				<th>budget</th>
			</tr>
			<c:forEach var="trst" items="${touristInfo}">
				<tr>
					<td>${trst.tid }</td>
					<td>${trst.tname }</td>
					<td>${trst.mobileNumber }</td>
					<td>${trst.destLocation }</td>
					<td>${trst.fromLocation }</td>
					<td>${trst.budget }</td>
				</tr>
				</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center;">error! no record
			found</h1>
	</c:otherwise>
</c:choose>