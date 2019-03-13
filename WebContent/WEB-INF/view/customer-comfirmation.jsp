<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Customer Details</title>
</head>
<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br>

${customer.country }

<br><br>

${customer.favoriteLanguage }

<br><br>

<ul>
<c:forEach var="temp" items="${customer.operatingsystem }">
<li> ${temp } </li>
</c:forEach>
</ul>

<br><br>

${customer.freePasses }

<br><br>

${customer.postalCode }

<br><br>

${customer.ID }


</body>
</html>