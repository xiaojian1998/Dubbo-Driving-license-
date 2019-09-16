<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		function add(id) {
			$.post(
					'update',
					$("form").serialize(),
					function(msg) {
						if(msg){
							alert("修改成功")
							location="list";
						}else{
							alert("修改失败")
						}
					}
				)		
		}
		function change(obj,subId) {
			var parentId=0;
			if(obj=='null'){
				parentId=0;
			}else{
				parentId=$(obj).val();
			}
			//alert($(obj).val())
		//	alert(parentId)
			$.post({
					url:"getarea?parentid=" + parentId,
					success:function(datas){
						$(subId).empty();
						$(subId).append('<option value="0">选择</option>')
						for(var i in datas){
						//	alert(datas)
							$(subId).append('<option value="'+datas[i].id+'">'+datas[i].name+'</option>')
						}
					}
					
				})
		}
		$(function(){
			
			change('null','#sheng');
		}
		)
	</script>
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table class="table">
		<tr>
			<td>驾驶证号码</td>
			<td colspan="2">
				<input type="hidden" name="id" value="${zzzz.id}">
				<input type="text" name="nums" value="${zzzz.nums}">
			</td>
		</tr>
		<tr>
			<td>司机姓名</td>
			<td>
				<input type="text" name="name" value="${zzzz.name}">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td colspan="2">
				男<input type="radio" name="sex" value="男" <c:if test="${zzzz.sex=='男' }"> checked="checked" </c:if> > 
				女<input type="radio" name="sex" value="女" <c:if test="${zzzz.sex=='女' }"> checked="checked" </c:if>>
			</td>
		</tr>
		<tr>
			<td>省
				<select id="sheng" name="shengid" onchange="change(this,'#shi')"></select>
			</td>
			<td>市
				<select id="shi"  name="shiid"  onchange="change(this,'#qu')"></select>
			</td>
			<td>区
				<select id="qu"  name="quid" ></select>
			</td>
		</tr>
		<tr>
			<td>发证日期</td>
			<td colspan="2">
				<input type="date" name="pushDate" value="${zzzz.pushDate}">
			</td>
		</tr>
		<tr>
			<td colspan="2"><button type="button" class="btn btn-info" onclick="add(${zzzz.id})">修改</button></td>
		</tr>
	</table>
	</form>
</body>
	
</html>