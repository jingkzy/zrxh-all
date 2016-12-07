<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../public/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<title>微信绑定系统账号</title>
<script type="text/javascript"
	src="http://tajs.qq.com/stats?sId=37342703" charset="UTF-8"></script>
<link rel="stylesheet" href="${frozenui }/css/frozen.css">
<link rel="stylesheet" href="${frozenui }/demo/demo.css">
<script src="${frozenui }/lib/zepto.min.js"></script>
<script src="${frozenui }/js/frozen.js"></script>
</head>

<body ontouchstart>
	<header class="ui-header ui-header-positive ui-border-b">
		<i class="ui-icon-return"></i>
		<h1>系统账号</h1>
		<!-- <button class="ui-btn">回首页</button> -->
	</header>
	<footer class="ui-footer ui-footer-btn">
		<ul class="ui-tiled ui-border-t">
			<li data-href="javascript:;" class="ui-border-r"><div>拒绝</div></li>
			<li data-href="javascript:;" class="ui-border-r"><div>同意</div></li>
			<li data-href="javascript:;"><div>退出</div></li>
		</ul>
	</footer>

	<section class="ui-container">
		<section id="form">
			<div class="demo-item">
				<div class="demo-block">
					<div class="ui-form ui-border-t">
						<div class="ui-form-item ui-form-item-l ui-border-b">
							<label class="ui-border-r"> 中国 +86 </label> <input type="text"
								placeholder="请输入手机号码" /> <a href="#" class="ui-icon-close">
							</a>
						</div>
						<div class="ui-form-item ui-form-item-pure ui-border-b">
							<input type="text" placeholder="系统账号" id="userName"> <a href="#" class="ui-icon-close"></a>
						</div>
						<div class="ui-form-item ui-form-item-pure ui-border-b">
							<input type="password" placeholder="系统密码" id="userPwd"> <a href="#" class="ui-icon-close"></a>
						</div>
					</div>
				</div>
			</div>
		</section>

	</section>

	<script>
        $('.ui-list li,.ui-tiled li').click(function(){
            if($(this).data('href')){
            	var dia=$.dialog({
			        title:'',
			        content:'您确定<'+$(this).text()+">吗？",
			        button:["确认","取消"]
			    });

			    dia.on("dialog:action",function(e){
			    	var userName = $("#userName").val();
			    	var userPwd  = $("#userPwd").val();
			    	var openid = "${openid}";
			    	var params = {openid:"${openid}",userName:userName,userPwd:userPwd};
			    	$.getJSON("${ctx }third/bind_weixin" ,params ,function(data){
			    		//alert(JSON.stringify(data));
			    		if(data.userId){
			    			location.href="${ctx}${successUrl}?t="+(new Date().getTime());
			    		}
			        },"json"); 
			    });
			    dia.on("dialog:hide",function(e){
			        console.log("dialog hide")
			    });
            }
        });
        $('.ui-header .ui-btn').click(function(){
            //location.href= 'index.html';
        });
        $('.ui-header .ui-icon-return').click(function(){
        	location.href="${ctx}${successUrl}?t="+(new Date().getTime());
        });
        </script>
</body>
</html>