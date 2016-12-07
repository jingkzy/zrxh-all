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
<title>联系我们</title>
<script type="text/javascript"
	src="http://tajs.qq.com/stats?sId=37342703" charset="UTF-8"></script>
<link rel="stylesheet" href="${frozenui }/css/frozen.css">
<link rel="stylesheet" href="${frozenui }/demo/demo.css">
<script src="${frozenui }/lib/zepto.min.js"></script>
<script src="${frozenui }/js/frozen.js"></script>
<script src="${weixin }/jweixin-1.0.0.js"></script>
<script src="${weixin }/tool.js"></script>
<script type="text/javascript">
	var jsfiles = new Array("config/jssdk?url="
			+ encodeURIComponent(location.href));
	importJs("${ctx}", jsfiles);
</script>
</head>

<body ontouchstart>
	<footer class="ui-footer ui-footer-btn">
		<ul class="ui-tiled ui-border-t">
			<li data-href="javascript:;" class="ui-border-r"><div>微信群</div></li>
			<li data-href="javascript:;" class="ui-border-r"><div>QQ群</div></li>
			<li data-href="javascript:;"><div>公司邮箱</div></li>
		</ul>
	</footer>
	<section class="ui-container">
		<section id="searchbar">
			<div class="demo-item">
				<div class="demo-block">
					<div class="ui-searchbar-wrap ui-border-b">
						<div class="ui-searchbar ui-border-radius">
							<i class="ui-icon-search"></i>
							<div class="ui-searchbar-text">搜索号码（2-10位）</div>
							<div class="ui-searchbar-input">
								<input value="" placeholder="搜索号码（2-10位）" autocapitalize="off">
							</div>
							<i class="ui-icon-close"></i>
						</div>
						<button class="ui-searchbar-cancel">取消</button>
					</div>
					<script type="text/javascript">
		                $('.ui-searchbar').tap(function(){
		                    $('.ui-searchbar-wrap').addClass('focus');
		                    $('.ui-searchbar-input input').focus();
		                });
		                $('.ui-searchbar-cancel').tap(function(){
		                    $('.ui-searchbar-wrap').removeClass('focus');
		                });
		            </script>
				</div>
			</div>
		</section>
		<section id="selector">
			<div class="demo-item">
				<div class="demo-block">
					<section class="ui-selector">
						<div class="ui-selector-content" style="display:">
							<ul>
								<li class="ui-selector-item active">
									<h3 class="ui-border-b">
										<p>中京国际微信客服</p>
										<span class="ui-txt-info">11</span>
									</h3>
									<ul class="ui-list ui-border-b">
										<li>
											<div class="ui-avatar-s">
												<span style="background-image: url(../img/ava1.png)"></span>
											</div>
											<div class="ui-list-info ui-border-t">
												<h4>飞翔的企鹅</h4>
											</div>
										</li>
										<li>
											<div class="ui-avatar-s">
												<span style="background-image: url(../img/ava1.png)"></span>
											</div>
											<div class="ui-list-info ui-border-t">
												<h4>飞翔的企鹅</h4>
											</div>
										</li>
										<li>
											<div class="ui-avatar-s">
												<span style="background-image: url(../img/ava1.png)"></span>
											</div>
											<div class="ui-list-info ui-border-t">
												<h4>飞翔的企鹅</h4>
											</div>
										</li>
									</ul>
								</li>
							</ul>
						</div>
					</section>
				</div>
			</div>
		</section>
	</section>
	<!-- /.ui-container-->
	<script>
		$('.ui-list li,.ui-tiled li').click(function() {
			if ($(this).data('href')) {
				location.href = $(this).data('href');
			}
		});
		$('.ui-header .ui-btn').click(function() {
			wx.closeWindow();
		});
	</script>
</body>
</html>