<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <link href="<c:url value="/resources/html/style.css" />" rel="stylesheet">

</head>
<body>
<div class="header">

   <img src="../../../resources/images/center_image.jpg">
    <p id="header1">Beauty Salons</p>
    <p id="header2">--find your favorite salon and register online--</p>
    <p id="blank1"></p>
    <form id="search1">
        <p  id="search2" >Search by address</p>
        <input type="text" name="search" placeholder="Search..">
    </form>
    <p id="blank2"></p>

    <div id="images">
        <c:forEach items="${salonList}" var="item">
            <div>
            <a href="?salonId=${item.salonId}"> >
                <img  class="salon_image" src="${item.image}" alt="image">
                <div>
                    <p class="href_text">${item.salonName}</p>
                </div>
            </a>
            </div>
        </c:forEach>
    </div>

</div>

</body>
</html>
