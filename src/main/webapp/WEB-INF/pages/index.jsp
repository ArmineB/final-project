<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body style="background-color: #ffe5f9;">
<div  style="height: 40px;
	width: 100%;">
<br>
   <img SRC="https://image.freepik.com/free-vector/purple-ornamental-background_1095-117.jpg"  style="
height: 90px;
width: 1500px;
margin: 0px auto;
top: 20px;
box-shadow: 5px 5px 5px #9ba5a3;">

    <h1 id="header1" style=" font-size: 50px;
    text-align: center;
    font-weight: bold;
    top: 400px;
    left: 400px;
    ">Beauty Salons</h1>
    <h2 style="
	text-align: center;
	font-weight: bold;
	color: #a1a1a1;
	top: 100px;">--find your favorite salon and register online--</h2>
<br>
    <p id="blank1" style="
	top: 220px;
	background-color: #6b1858;
	height: 10px;
	box-shadow: 5px 5px 5px #9ba5a3;
	width: 100%;"></p>

    <p id="blank2" style="
	top: 370px;
box-shadow: 5px 5px 5px #9ba5a3;
	background-color:#6b1858;
	height: 10px;
	width: 100%;"></p>
<br>

    <div id="images" style="	width: 100%;
	top: 430px;
	left: 60px;
	right: 60px;">
        <br>
        <br>
        <c:forEach items="${salonList}" var="item">
            <%--<div>--%>
            <%--<a href="${pageContext.request.contextPath}/salons/salon?salonId=${item.salonId}">--%>
                <%--<img  style="width: 200px;--%>
	<%--height: 200px;--%>
	    <%--border: 3px solid #a1a1a1;--%>
	  <%--"  src="${item.image}" alt="image">--%>
                <%--<div>--%>
                    <%--<p class="href_text" style="font-size:20px;--%>
                    <%--text-align: center;--%>
                    <%--left: 20px;--%>
                    <%--margin-top: 10px;--%>
                    <%--margin-left: 10px;">${item.salonName}</p>--%>
                <%--</div>--%>
            <%--</a>--%>
            <%--</div>--%>
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="${pageContext.request.contextPath}/salons/salon?salonId=${item.salonId}" target="_blank">
                        <img src="${item.image}" alt="image" style="width:100%">
                        <div class="caption">
                            <p style="font-size: 20px; font-weight: bold;">${item.salonName}</p>
                        </div>
                    </a>
                </div>
            </div>
        </c:forEach>
    </div>

</div>

</body>
</html>
