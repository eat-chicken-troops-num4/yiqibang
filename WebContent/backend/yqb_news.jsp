<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻管理</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="../jquery/jquery-1.11.1.min.js"></script>
<script src="../js/date_util.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>

<style>
#header nav {
	margin-bottom: 0;
}

#content .list-group a {
	border-radius: 0;
}

#content .right_box {
	padding: 0px;
}

#content .right_box .panel, #content .right_box .panel-heading {
	border-radius: 0;
}

table thead tr th {
	text-align: center;
}

.icon_row .row {
	margin: 0;
}

.icon_row .row span {
	font-size: 20px;
}

.icon_row .row span:hover {
	color: red;
}

.news_tr>td {
	vertical-align: middle !important;
}

.cop_row>div>.input-group {
	margin-top: 3px;
}

.cop_row>div>button {
	margin-top: 4.5px;
}

#addNewsModal {
	padding-bottom: 100px;
	overflow: scroll;
}

@media ( min-width :768px) {
	#addNewsModal .modal-dialog {
		width: 70%;
	}
}

.upload_btn {
	margin-top: 10px;
}

.edui-popup-content.edui-default {
	height: auto !important;
}

.news_tr td {
	max-width: 200px;
	text-over: ellipsis;
	white-space: nowrap;
	overflow: hidden;
}

.news_tr>td>div {
	height: 30px;
}
</style>
<script>
function showNewsData(data) {
	if (data.retMsg) {
		$("#newsList_body").html("");
		var newslist = data.retData;
		for (var i = 0; i < newslist.length; i++) {
			var news = newslist[i];
			$("#newsList_body")
					.append(
							'<tr align="center" class="news_tr">' + '<td>'
									+ (i + 1)
									+ '</td>'
									+ '<td id="type'+i+'"></td>'
									+ '<td title="'+news.nTitle+'">'
									+ news.nTitle
									+ '</td>'
									+ '<td>'
									+ news.nSource
									+ '</td>'
									+ '<td>'
									+ news.nAuthor
									+ '</td>'
									+ '<td id="content'+i+'">'
									+ '<div>'
									+ news.nContent
									+ '</div>'
									+ '</td>'
									+ '<td>'
									+ getStrDate(news.nCreatetime.time)
									+ '</td>'
									+ '<td>'
									+ news.nCommcount
									+ '</td>'
									+ '<td>'
									+ news.nReadcount
									+ '</td>'
									+ '<td>'
									+ (news.nIfhot ? "是" : "否")
									+ '</td>'
									+ '<td>'
									+ (news.nIfreport ? "是" : "否")
									+ '</td>'
									+ '<td class="icon_row">'
									+ '<div class="row">'
									+ '<div class="col-md-6 text-center">'
									+ '<span class="glyphicon glyphicon-cog cofigBtn" id="configBtn'+i+'" ></span>'
									+ '</div>'
									+ '<div class="col-md-6 text-center">'
									+ '<span class="glyphicon glyphicon-trash" id="deleteBtn'
									+ i + '" onclick="deleteNew(' + news.id
									+ ')"></span>' + '</div>' + '</div>'
									+ '</td>' + '</tr>');
	}
}
</script>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="container_fluid">
		<div class="row">
			<div class="col-md-2">
				<%@include file="left.jsp"%>
			</div>
			<div class="col-md-10 right_box">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<div class="row cop_row">
							<div class="col-md-2">
								<h4>新闻列表</h4>
							</div>
							<div class="col-md-offset-2 col-md-3">
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="标题/内容/时间/来源" id="searchTv"> <span
										class="input-group-btn">
										<button class="btn btn-default" type="button"
											onclick="searchNewsByLike()">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-offset-3 col-md-2">
								<button type="button" class="btn btn-default btn-sm"
									onclick="addNewsBtn()">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									添加
								</button>
							</div>
						</div>


					</div>
					<div class="panel-body">
						<table class="table table-bordered table-stripted">
							<thead>
								<tr>
									<th>序号</th>
									<th>类型</th>
									<th>标题</th>
									<th>来源</th>
									<th>作者</th>
									<th>内容</th>
									<th>时间</th>
									<th>评论</th>
									<th>浏览</th>
									<th>是否热点</th>
									<th>是否被举报</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="newsList_body">


							</tbody>
						</table>
					</div>
					<div class="panel-footer text-center">
						<nav aria-label="Page navigation">
						<ul class="pagination" id="pageBtn">
							<li><a href="#" aria-label="Previous"> <span
									aria-hidden="true">&laquo;</span>
							</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#" aria-label="Next"> <span
									aria-hidden="true">&raquo;</span>
							</a></li>
						</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="progress.jsp"></jsp:include>
</body>
</html>