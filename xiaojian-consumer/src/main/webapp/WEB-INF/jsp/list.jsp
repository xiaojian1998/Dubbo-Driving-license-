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
		function deleteOne(id) {
			$.post(
				'deleteOne',
				{id:id},
				function(msg) {
					if(msg){
						alert("删除成功")
						location="list";
					}else{
						alert("删除失败")
					}
				}
			)		
		}
		function add() {
			location="toadd";
		}
		function getlist() {
			
			var name=$("[name='name']").val();
			location="list?name="+name;
		}
		function toUpdate(id) {
			
			location="toupdate?id="+id;
		}
	</script>
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
			<td>
				<button type="button" class="btn btn-success" onclick="add()">添加</button>
				
					司机姓名:<input type="text" name="name">
					<button type="button" class="btn btn-info" onclick="getlist()">查询</button>
				
			</td>
		</tr>
		<tr>
			<td>驾驶证号码</td>
			<td>司机姓名</td>
			<td>性别</td>
			<td>省</td>
			<td>市</td>
			<td>区</td>
			<td>发证日期</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list.list}" var="list"> 
			<tr>
				<td>${list.nums}</td>
				<td>${list.name}</td>
				<td>${list.sex}</td>
				<td>${list.sheng}</td>
				<td>${list.shi}</td>
				<td>${list.qu}</td>
				<td>${list.pushDate}</td>
				<td>
					<button type="button" class="btn btn-outline-primary" onclick="toUpdate(${list.id})">修改</button>
					<button type="button" class="btn btn-outline-danger" onclick="deleteOne(${list.id})">删除</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="12">
				<ul class="pagination">
		<c:if test="${list.pageNum>1}">
			<li class="page-item"><a class="page-link"
				 href="${pageContext.request.contextPath}/list?pageNum=${list.pageNum-1}">上一页</a>
			</li>
		</c:if>

		<c:forEach var="page" items="${list.navigatepageNums }">
				<li class="page-item">
					<a class="page-link"
						href="${pageContext.request.contextPath}/list?pageNum=${page}">${page}</a>
				</li>
		</c:forEach>

		<c:if test="${list.pageNum<list.pages}">
				<li class="page-item">
					<a class="page-link"
						href="${pageContext.request.contextPath}/list?pageNum=${list.pageNum+1}">下一页</a>
				</li>
		</c:if>
	</ul>
			</td>
		</tr>
	</table>
</body>
	
</html>