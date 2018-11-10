<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <title>
    </title>
    <body>
    <script>
        function getAllBooks(obj) {
            window.location.href = "book/list";
        }
    </script>
    <br>
        原作者没写前端，所以访问404不要奇怪。<br/>
        这个项目主要搭建了后台框架，供测试用。<br/>
        <button id="getAllBooks" onclick="javascrtpt:getAllBooks(this)">查询图书列表</button><br/>

        <%--对静态资源的访问，必须进行默认servlet配置。这里可加载本地资源，也可以访问CDN资源--%>
        <img src="http://p1.img.cctvpic.com/uploadimg/2018/11/05/1541399476463682.png"  alt="加载图片-photo" /></br>

    </body>

</html>