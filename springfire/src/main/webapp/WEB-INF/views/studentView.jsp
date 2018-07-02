<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
    </head>
    <body>
        <h3><spring:message code="student.action.add"/></h3>
        <form:form method="POST"
          action="student/save" modelAttribute="student">
             <table>
                <tr>
                	
                    <td><form:label path="name" >
                    <spring:message code="student.details.name"/> </form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="id"><spring:message code="student.details.id"/></form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="contactNumber">
                      <spring:message code="student.details.contact.number"/></form:label></td>
                    <td><form:input path="contactNumber"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        Current Language : ${pageContext.response.locale} 
    </body>
</html>