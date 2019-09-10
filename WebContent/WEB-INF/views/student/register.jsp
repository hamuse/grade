<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생관리프로그램</title>
</head>
<body>
<div>
<form id="register"	action="<%=request.getContextPath()%>/student.do">
 	이름:<input type="text" name="name"/>
	주민등록번호:<input type="text" name="ssn"/>
	<input type="hidden" name="action" value="register"/>
	<input type="hidden" name="dest"	value="login"/>
	<input type="submit" id="btn"value="확인"/>
</form>
</div>
<script>
$('#register').submit(function(){
	alert("로그인으로 이동");
	location.assign('<%=request.getContextPath()%>/student.do?action=register&dest=login');
});

</script>
</body>
</html>