<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>検索結果</h1>
	<div>
		<p>データを取得しました</p>
		product_id:${id.getproduct_id()}<br>
		product_name:${id.getproduct_name()}<br> price:${id.getprice()}
	</div>
</body>
</html>
