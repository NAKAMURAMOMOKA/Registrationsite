<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="<c:url value="/css/Register.css" />" rel="stylesheet">
<title>menu</title>
</head>
<body>
<h1>メニュー画面</h1>

<form action="/MemberInformation/RegisterServlet" method="GET">

    <p><button type="submit">会員情報新規登録</button></p>
</form>

<p><button type="submit">会員情報変更</button></p>

<p><button type="submit">会員情報削除</button></p>

</body>
</html>

