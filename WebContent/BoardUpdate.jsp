<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function boardUpdateProcess(){
		updateform.submit();
	}
</script>
</head>
<body>
	<form action="boardupdateprocess" method="post" name="updateform">
		글번호<br>
		<input type="text" name="bnumber" id="bnumber" value="${boardUpdate.bnumber}" readonly><br>
		글쓴이<br>
		<input type="text" name="bwriter" id="bwriter" value="${boardUpdate.bwriter}"><br>
		제목<br>
		<input type="text" name="btitle" id="btitle" value="${boardUpdate.btitle}"><br>
		내용<br>
		<textarea cols="30" rows="10" type="text" name="bcontents" id="bcontents">${boardUpdate.bcontents}</textarea><br>
	</form>
	<button onclick="boardUpdateProcess()">수정</button>
</body>
</html>