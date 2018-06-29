<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
	<h3>Student details saved</h3>
	<table>
		<tr>
			<td>Name :</td>
			<td>ID :</td>
			<td>Contact Number :</td>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.name}</td>
				<td>${student.id}</td>
				<td>${student.contactNumber}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</body>

</html>