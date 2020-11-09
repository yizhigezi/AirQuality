<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<script src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>
<body>
    <h1>添加空气质量信息</h1>
    <form action="ins" method="post">
    监测区域：<select name="did">
        <c:forEach var="a" items="${dlist}">
            <option value="${a.id}">${a.name}</option>
        </c:forEach>

    </select>
        监测日期：<input name="time">
        pm10值：<input name="pm10">
        pm2.5:<input name="pm2_5">
        监测站：<input name="station">
        <input type="submit"><input type="reset"><a href="getAll">返回</a>
    </form>
</body>
</html>