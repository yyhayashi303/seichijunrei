$(function(){
	$(document).ready(function (){
		// contentsサイズ初期化
		var body = $("body");
		var side = $("div#sidemenu");
		$("div#contents").width(body.width() - side.outerWidth(true));
		
		 if (GBrowserIsCompatible()) {
			 var map = new GMap2(document.getElementById("map_canvas"));
		     map.setCenter(new GLatLng(35.363663,136.459915), 13);
		 }
	});
});