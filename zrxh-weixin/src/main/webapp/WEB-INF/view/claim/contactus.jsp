<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../public/header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta name="format-detection" content="telephone=no">
        <title>FrozenUI Demo</title>
        <script type="text/javascript" src="http://tajs.qq.com/stats?sId=37342703" charset="UTF-8"></script>
        <link rel="stylesheet" href="../css/frozen.css">
        <link rel="stylesheet" href="demo.css">
        <script src="../lib/zepto.min.js"></script>
        <script src="../js/frozen.js"></script>
    </head>
    
    <body ontouchstart>
        <header class="ui-header ui-header-positive ui-border-b">
            <i class="ui-icon-return" onclick="history.back()"></i><h1>箭头链接 arrowlink</h1><button class="ui-btn">回首页</button>
        </header>
        <footer class="ui-footer ui-footer-btn">
            <ul class="ui-tiled ui-border-t">
                <li data-href="index.html" class="ui-border-r"><div>基础样式</div></li>
                <li data-href="ui.html" class="ui-border-r"><div>UI组件</div></li>
                <li data-href="js.html"><div>JS插件</div></li>
            </ul>
        </footer>
        <section class="ui-container">




<section id="arrowlink">
    <div class="demo-item">
        <p class="demo-desc">箭头链接</p>
        <div class="demo-block">
            <div class="ui-arrowlink">箭头链接</div>
        </div>
    </div>
</section>


        </section><!-- /.ui-container-->
        <script>
        $('.ui-list li,.ui-tiled li').click(function(){
            if($(this).data('href')){
                location.href= $(this).data('href');
            }
        });
        $('.ui-header .ui-btn').click(function(){
            location.href= 'index.html';
        });
        </script>
    </body>
</html>

<!-- 
<html>
  <head> 
    <title>理赔</title>
    <meta content="yes" name="apple-mobile-web-app-capable" />  
    <meta content="black" name="apple-mobile-web-app-status-bar-style" />  
    <meta name="viewport" content="width=device-width,target-densitydpi=high-dpi,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />   
    <meta content="telephone=no" name="format-detection" />
	<style>
		body {
		　　　　font: normal 100% Helvetica, Arial, sans-serif;
		　　}
		@media screen and (max-device-width: 400px) {  
    　　.column {  
    　　　　float: none;  
    　　　　width:auto;  
    　　}  
    　　#sidebar {  
    　　　　display:none;  
    　　}  
    }
	</style>
  </head>
 <body>
  <h1>openid</h1><hr>
  <h2>${openid }</h2><br>
  <h1>html_access_token</h1><hr>
  <h2>${html_access_token }</h2><br>
  <h1>user_info</h1><hr>
  <h2>${user_info }</h2><br>
 </body>
</html> -->