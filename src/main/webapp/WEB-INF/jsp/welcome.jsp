<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <title>
    </title>
    <script>
        function getAllBooks(obj) {
            window.location.href = "book/list";
        }
    </script>
    <body>
        原作者没写前端，所以访问404不要奇怪。<br/>
        这个项目主要搭建了后台框架，供测试用。<br/>
    <button id="getAllBooks" onclick="javascrtpt:getAllBooks(this)">查询图书列表</button>

    </body>

</html>