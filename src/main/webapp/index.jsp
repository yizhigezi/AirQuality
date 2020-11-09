<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<script src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    function aaa(id) {
        var a = confirm("是否删除？")
        if(a){
            window.location.href="del?id="+id;
        }
    }
</script>
<body>
<a href="Dsel">添加监测站</a>
序号-区域-监测时间-pm10-pm2.5-监测站<br>
<c:forEach var="d" items="${list}">
    ${d.id }-${d.station }-${d.time }-${d.pm10 }-${d.pm2_5 }-${d.name }<a  onclick="aaa(${d.id })">删除</a><br>
</c:forEach>
<a href="getAll?index=${1}">首页</a>
<a href="getAll?index=${index-1 }">上</a>
<a href="getAll?index=${index+1 }">下</a>
<a href="getAll?index=${page}">尾页</a>
</body>
</html>
