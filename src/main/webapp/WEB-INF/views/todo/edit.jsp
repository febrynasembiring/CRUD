<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Edit Data</title>
</head>
<body>
<h1>Edit Data</h1>
<a href="/todo/list-all">List All</a>
<form:form modelAttribute="todo" action="../update" method="post">
<fieldset>
<legend>Edit Data</legend>
<form:hidden path="id"/>
<p>
<label for="user">User: </label>
<form:input id="user" path="user"/>
</p>
<p>
<label for="description">Description: </label>
<form:input id="description" path="description"/>
</p>
<p>
<label for="targetDate">Target Date: </label>
<form:input id="targetDate" path="targetDate"/>
</p>
<p>
<label for="starMeter">Star Meter:</label>
<form:input id="starMeter" path="starMeter" />
</p>
<p id="buttons">
<input id="reset" type="reset" >
<input id="submit" type="submit" value="Update Data">
</p>
</fieldset>
</form:form>
</body>
</html>