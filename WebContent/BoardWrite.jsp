<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
 	function boardWrite(){
 		writeform.submit();
 	}
</script>
</head>
<body>
	<form action="boardwrite" method="post">
		작성자<br>
		<input type="text" name="bwriter" id="bwriter"><br>
		비밀번호<br>
		<input type="text" name="bpassword" id="bpassword"><br>
		제목<br>
		<input type="text" name="btitle" id="btitle"><br>
		내용<br>
		<textarea rows="10" cols="10" type="text" name="bcontents" id="bcontents"></textarea><br>
        <button onclick="boardWrite()">글작성</button>
        <button onclick="boardList()">글목록</button> 
	</form>
</body>
</html>