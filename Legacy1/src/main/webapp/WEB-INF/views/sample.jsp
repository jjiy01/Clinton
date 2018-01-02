<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
<title>Sample</title>
</head>
<body>
<div id="div1">
</div>
<script>
(function () {
	$.ajax({url: "/api", success: function(result){
        $("#div1").html(result.id);
    }});
})();
</script>
</body>
</html>