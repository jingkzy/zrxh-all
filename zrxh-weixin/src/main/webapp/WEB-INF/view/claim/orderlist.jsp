<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../public/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="format-detection" content="telephone=no">
	<title>查询订单</title>
	<script type="text/javascript" src="http://tajs.qq.com/stats?sId=37342703" charset="UTF-8"></script>
	<link rel="stylesheet" href="${frozenui }/css/frozen.css">
	<link rel="stylesheet" href="${frozenui }/demo/demo.css">
	<script src="${frozenui }/lib/zepto.min.js"></script>
	<script src="${frozenui }/js/frozen.js"></script>
	<script src="${weixin }/jweixin-1.0.0.js"></script>
	<script src="${weixin }/tool.js"></script>
	<script type="text/javascript">
		var jsfiles = new Array("config/jssdk?url="+encodeURIComponent(location.href));
		importJs("${ctx}",jsfiles);
	</script>
</head>

<body ontouchstart>
	<footer class="ui-footer ui-footer-btn">
		<ul class="ui-tiled ui-border-t">
			<li data-href="javascript:;" class="ui-border-r"><div>成功列表</div></li>
			<li data-href="javascript:;" class="ui-border-r"><div>失败列表</div></li>
		</ul>
	</footer>
	<section class="ui-container">
		<section id="table">
		    <div class="demo-item">
		        <div class="demo-block">
		            <table class="ui-table ui-border">
		                <thead>
		                <tr><th>车牌号</th><th>状态</th><th>操作</th></tr>
		                </thead>
		                <tbody>
		                <tr><td>京AB1234</td><td>成交</td><td><a href="#">详情</a></td></tr>
		                <tr><td>京AB1234</td><td>成交</td><td><a href="#">详情</a></td></tr>
		                <tr><td>京AB1234</td><td>退回</td><td><a href="#">详情</a></td></tr>
		                </tbody>
		            </table>
			        </div>
		    </div>
		    <div class="demo-item">
		    	<iframe src="${ctx }map/weixin/map.html"></iframe>
		    </div>
		</section>
	</section>
	<!-- /.ui-container-->
	<script>
        $('.ui-list li,.ui-tiled li').click(function(){
            if($(this).data('href')){
                location.href= $(this).data('href');
            }
        });
        $('.ui-header .ui-btn').click(function(){
            wx.closeWindow();
        });
        </script>
</body>
</html>