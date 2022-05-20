<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>検索条件を入力してください</h1>
	<div>
		<form action="check" method="post">
			<p>${i}</p>
			<!-- EL式で変数のみだけでOK -->
			<!-- 入力された値の送信先（action）はcheckになっています。 -->
			<!-- この場合「/${context}/check」という宛先になります。 -->
			<div>
				product_id: <input type="text" name="product_id">
			</div>
			<div>
				<button type="submit">検索</button>
			</div>
		</form>
	</div>
</body>
</html>
