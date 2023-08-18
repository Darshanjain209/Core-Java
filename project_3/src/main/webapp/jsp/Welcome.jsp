<%@page import="in.co.rays.project_3.controller.ORSView"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
body {
	background-image: url('<%=ORSView.APP_CONTEXT%>/img/pngtree-holiday-landscape-mountain-river-background-vector-material-image_124327.jpg');
	background-size: cover;
}
</style>

</head>
<body class="img-fluid">
	<div class="header">
		<%@include file="Header.jsp"%>
	</div>
	<div class="text-cs1">
		<center>
			<h1 style="padding-top: 15%; color: red; font-size: 50px;">
				<b class="classnames">Welcome To Online Result System</b>
			</h1>
		</center>
	</div>
	<div class="footer">
		<%@include file="FooterView.jsp"%>
	</div>
</body>

</html>