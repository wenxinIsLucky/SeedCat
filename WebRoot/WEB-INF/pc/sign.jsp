<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	HttpSession sess = request.getSession();
    List<String> numbers = new ArrayList<String>();
    numbers.add("1");numbers.add("2");numbers.add("3");
    numbers.add("4");numbers.add("5");numbers.add("6");
    numbers.add("7");numbers.add("8");numbers.add("9");
    Collections.shuffle(numbers);
    StringBuffer sb = new StringBuffer();
    for(int i=1;i<=9;i++)
    {
        int pos=0;
        for(pos=0;pos<numbers.size();pos++)
        {
            if(numbers.get(pos).equals(i+"")) break;
        }
        pos++;
        sb.append(pos);
    }
    sess.setAttribute("idycode", sb.toString());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'sign.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<script type="text/javascript" src="pc/js/sign.js"></script>
<style type="text/css">
	.fc{
		width: 320px;
		height: 345px;
		position: fixed;
		top:0;
		left:0;
		bottom:0;
		right:0;
		margin:auto;
		z-index: 1001;
		background-color: #fff;
		border:1px solid #ddd;
		webkit-box-shadow: #666 0px 0px 10px;
		moz-box-shadow: #666 0px 0px 10px;
	    box-shadow: #666 0px 0px 10px;
	    border-radius:10px;
	}
	form{
		margin: 0px auto;
		display: block;
		width: 300px;
		height: 300px;
	}
	.fc .msg_p{
		color:red;
		font-size:12px;
		text-align: center;
	}
</style>
</head>

<body>
	<div class="fc">
		<p class="msg_p">请按照1-9的顺序点击</p>
		<form action="" name="loginForm">
			<div class="identityCode">
				<%
					for (int i = 0; i < numbers.size(); i++) {
				%>
				<div class="item">
					<%
						out.print(numbers.get(i));
					%>
				</div>
				<%
					}
				%>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript">
	$.idycode({
        'form':document.loginForm,
    });
	$(document.loginForm).on('click',function(e){
		var myorder = $('input[name="idycode"]').val();
		if(undefined!=myorder){
			var code = '<%=sess.getAttribute("idycode")%>';
			if(code === myorder){
				$('.error_mask,.fc').hide();
				$.ajax({
			        type: "POST",
			        url: "login",
					dataType: "json",
			        data: {
			            "account" : parent.$(".loginName").val(),
						"password" : parent.$(".loginPass").val(),
						"url" : parent.$("#url").val()
			        },
			        timeout: 20000,
					beforeSend: function(XMLHttpRequest) {
						parent.$(".btnSubmit1").attr("disabled", true);
						parent.$(".tips1").show();
						parent.$(".tips1").text("正在登录，请稍候...");
					},
			        success: function(re) {
			        	if(re.status === 200){
			        		top.location.href = re.url;
			    		}else{
			    			parent.$(".btnSubmit1").attr("disabled", false);
			    			parent.$(".tips1").text(re.msg);
			    			parent.$("#error_mask,iframe").hide();
			    		}
			        },
					error: function (XMLHttpRequest, textStatus, errorThrown) {
						parent.$(".tips1").text("状态：" + textStatus + "；出错提示：" + errorThrown);
						parent.$(".btnSubmit1").attr("disabled", false);
						parent.$("#error_mask,iframe").hide();
					} 
			    });
			}else{
				alert("点击顺序错误");
				parent.refreshSign();
			}
		}
	});
	</script>
</html>
