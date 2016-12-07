/**
 * 获取url参数
 */
function getUrlParam(name){
	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
	var r = window.location.search.substr(1).match(reg);  //匹配目标参数
	if (r!=null) return unescape(r[2]); return null; //返回参数值
}
/**
 * 引入JS文件
 */
function importJs(host,jsfiles){
	var agent = navigator.userAgent;
	var docWrite = (agent.match("MSIE") || agent.match("Safari"));
	docWrite = false;
	if (docWrite) {
		var allScriptTags = new Array(jsfiles.length);
	}
	for (var i = 0, len = jsfiles.length; i < len; i++) {
		if (docWrite) {
			allScriptTags[i] = "<script src='" + host + "/" +jsfiles[i] + "'></script>";
		} else {
			var s = document.createElement("script");
			s.src = host + jsfiles[i];
			var h = document.getElementsByTagName("head").length ? document.getElementsByTagName("head")[0] : document.body;
			h.appendChild(s);
		}
	}
	if (docWrite) {
		document.write(allScriptTags.join(""));
	}
}
/**
 * 微信分享公用控制
 */
wx.ready(function () {
	wx.onMenuShareTimeline({
	    title: '中京国际保险销售（北京）有限公司', // 分享标题
	    link: 'http://www.baidu.com', // 分享链接
	    imgUrl: "http://zjwx.51zhanye.com/weixin/static/weixin/share.jpg", // 分享图标
	    success: function () { 
	        // 用户确认分享后执行的回调函数
	    },
	    cancel: function () { 
	        // 用户取消分享后执行的回调函数
	    }
	});
	wx.onMenuShareAppMessage({
	    title: '中京国际保险销售（北京）有限公司', // 分享标题
	    desc: '', // 分享描述
	    link: 'http://www.baidu.com', // 分享链接
	    imgUrl: 'http://zjwx.51zhanye.com/weixin/static/weixin/share.jpg', // 分享图标
	    type: 'link', // 分享类型,music、video或link，不填默认为link
	    dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
	    success: function () { 
	        // 用户确认分享后执行的回调函数
	    },
	    cancel: function () { 
	        // 用户取消分享后执行的回调函数
	    }
	});
});