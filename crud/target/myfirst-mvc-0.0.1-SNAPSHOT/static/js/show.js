/*
 * 新增用户
 */
$("#p-add").click(function() {
	$(".add").show();
	$(".update").hide();
});
// 点击关闭按钮
$(".add-guanbi").click(function() {
	$(".add").hide();
})

/*
 * 编辑用户
 */
/*$(".p-update").click(function() {
	$(".update").show();
	$(".add").hide();
});
*/
// 点击关闭按钮
$(".update-guanbi").click(function() {
	$(".update").hide();
	
	//重定向
	window.location.href="index.jsp";
})