<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.js"></script>
<title>使用MD5实现密码单向加密</title>
</head>
<body>
<input type="text" id="test">
<input type="button" id="button" value="md5测试" onclick="test()">
<div id="div"></div> 

<script type="text/javascript">
      var  str = $("#test").val();
      var md5str = md5str($("#test").val());
      alert(md5str);
      $("#div").empty();
      $("#div").append(md5str);
      
      
</script>

</body>
</html>