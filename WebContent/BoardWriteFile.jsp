<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
 	function boardWriteFile(){
 		writeform.submit();
 	}
 	function boardList(){
 		location.href='boardlist';
 	}
</script>
</head>
<body>
	<form action="boardwritefile" method="post" name="writeform" enctype="multipart/form-data">
		작성자<br>
		<input type="text" name="bwriter" id="bwriter"><br>
		제목<br>
		<input type="text" name="btitle" id="btitle"><br>
		내용<br>
		<textarea rows="10" cols="30" type="text" name="bcontents" id="bcontents"></textarea><br>
		첨부파일<br>
		<input type="file" name="bfile" id="bfile"><br>
		
        <button onclick="boardWriteFile()">글작성(파일)</button>
        <button onclick="boardList()">글목록</button> 
	</form>
</body>
</html>