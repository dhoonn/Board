<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function move(){
	location.href="boardlist";
	}
	function update(){
	location.href="boardupdate?bnumber="+${boardView.bnumber};
	}
</script>
</head>
<body>
		글번호 : ${boardView.bnumber}<br>
		글쓴이 : ${boardView.bwriter}<br>
		제목 : ${boardView.btitle}<br>
		내용 : ${boardView.bcontents}<br>
		작성일자 : ${boardView.bdate}<br>
		조회수 : ${boardView.bhits}<br>
		<br>
		<button onclick = "move()">목록보기</button>
		<button onclick = "update()">수정</button>
</body>
</html>