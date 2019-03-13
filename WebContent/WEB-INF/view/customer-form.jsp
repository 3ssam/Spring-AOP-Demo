<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>

<title>Customer Form Registration</title>

<style>
 .error {color:red}
 </style>
 
</head>
<body>
<form:form modelAttribute="customer" action="processForm">

First Name<form:input path="firstName"/>
<form:errors path="lastName" cssClass="error" />
<br><br>

Last Name<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br><br>

Free Passes<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error" />
<br><br>

Postal Code<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error" />
<br><br>

ID<form:input path="ID"/>
<form:errors path="ID" cssClass="error" />
<br><br>

<form:select path="country">
<form:options items="${customer.countryOptions}" />
<br><br>



The Favorite Language :
<form:radiobutton path="favoriteLanguage" value="Java"/>Java
<form:radiobutton path="favoriteLanguage" value="C#"/>C#
<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby
<form:radiobutton path="favoriteLanguage" value="Swift"/>Swift
<br><br>


My Operating System :
Linux <form:checkbox path="operatingsystem" value="Linux" />
Mac OS <form:checkbox path="operatingsystem" value="Mac OS" />
Windows <form:checkbox path="operatingsystem" value="Windows" />
<br><br>


</form:select>
<input type="submit" value="Submit"/>
</form:form>


</body>
</html>