<%--
  Created by IntelliJ IDEA.
  User: yuanwenfei
  Date: 2015/5/14
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="formLogin" id="formLogin" action="/user/createUser" method="post">

  <div>
    <ul class="uibutton-group">
      <input name="userName" id="userName" value="wangwu" />
    </ul>
  </div>

  <div>
    <ul class="uibutton-group">
      <li><a href = "javascript:" onclick ="add();">登陆2</a></li>
    </ul>
  </div>
  </form>

<script type="text/javascript">
  function add()
  {
    document.getElementById("formLogin").submit();
//    document.form.submit();
    //document.argform.submit();
    //document.getElementById("argsubmit").click();
  }
</script>

</body>
</html>
