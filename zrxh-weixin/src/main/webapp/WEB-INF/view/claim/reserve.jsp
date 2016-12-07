<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../public/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="format-detection" content="telephone=no">
	<title>预约修车</title>
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
			<li data-href="javascript:;" class="ui-border-r"><div>提交</div></li>
		</ul>
	</footer>
	<section class="ui-container">
		<section>
			<div class="demo-item">
				<div class="demo-block">
					<div class="ui-form ui-border-t">
						<form action="#">
							<div class="ui-form-item ui-border-b">
								<label> 车牌号 </label> <input type="text" id="carNo" name="carNo" placeholder="车牌号必填" />
								<a href="javascript:clearValue('carNo');" class="ui-icon-close"> </a>
							</div>
							<div class="ui-form-item ui-border-b">
								<label> 联系人  </label><input type="text" id="contacts" name="contacts" placeholder="联系人必填" />
								<a href="javascript:clearValue('contacts');" class="ui-icon-close"> </a>
							</div>
							<div class="ui-form-item ui-border-b">
								<label> 车型  </label><input type="text" id="carType" name="carType" placeholder="车型必填" />
								<a href="javascript:clearValue('carType');" class="ui-icon-close"> </a>
							</div>
							<div class="ui-form-item ui-border-b">
								<label> 维修店 </label><input type="text" id="repairShop" name="repairShop" placeholder="维修店必选" />
								<a href="javascript:clearValue('repairShop');" class="ui-icon-close"> </a>
							</div>
							<div class="ui-form-item ui-border-b">
								<label> 代理人 </label><input type="text" id="agent" name="agent" placeholder="代理人必填" />
								<a href="javascript:clearValue('agent');" class="ui-icon-close"> </a>
							</div>
						</form>
					</div>
				</div>
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
        function clearValue(id){
        	$("#"+id).val('');
        }
        </script>
</body>
</html>