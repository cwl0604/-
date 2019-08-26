
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>药品查询列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <form action="findDrugbyName.action">
    <table bgcolor="#9999dd" border="1" width="480" align="center">
    
    <tr><td>药品名字：</td>
    <td><input type="text" name="drugname"></td>
    </tr></table><input type="submit" value="查询">
    <input type="reset" value="重置"></form>
  <body>
    
    <table bgcolor="#CCCCCC" border="1" cellspacing=1 cellpadding=5 width=100%>
    <tr bgcolor="#DDDDDD">
    <th>药品id</th>
    <th>药品名称</th>
    <th>药品规格</th>
    <th>药品状态</th>
    <th>单位</th>
    <th>剩余瓶数</th>
    <th>剩余总量</th>
    <th>危险类型</th>
     
    </tr>
    <c:forEach items="${drugList }" var="drug">
    <tr>
    <td>${drug.drugid }</td>
    <td>${drug.drugname }</td>
    <td>${drug.drugstandard }</td>
    
    <td>${drug.drugstate }</td>
    <td>${drug.drugunit }</td>
    <td>${drug.drugcount }</td>
    <td>${drug.drugtotal }</td>
    <td>${drug.drugtype }</td>
    <td>
    <form action="deletedrug.action" method="post">
    <input name="drugid" value="${drug.drugid }" type="hidden">
    <input type="submit" value="删除"> 
     </form>
     <form action="modifyDrug.action" method="post">
    <input name="drugid" value="${drug.drugid }" type="hidden">
    <input type="submit" value="修改"> 
     </form>
     </td>
    </tr>
    </c:forEach>
    </table>
    
  </body>
</html>
