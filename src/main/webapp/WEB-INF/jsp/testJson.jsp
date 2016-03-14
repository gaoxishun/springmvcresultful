<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>Uikit Test</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<body>


<script type="text/javascript" src="${basePath}static/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${basePath}static/uikit-2.22.0/js/uikit.min.js"></script>
<script type="text/javascript" src="${basePath}static/uikit-2.22.0/js/components/notify.min.js"></script>
<script type="text/javascript">
            $(document).ready(function(){

                var saveDataAry=[];
                var data1={"username":"test","password":"1234","workList":[{"city":"11","job":"hangjinhouqi"}],"schoolInfoList":[{"schoolType":"22222","schoolName":"898989898"}]};

                //var data2={"username":"ququ","password":"4567"};
                saveDataAry.push(data1);
                //saveDataAry.push(data2);

                $.ajax({
                    type:"POST",
                    url:"/parameter/saveJson",
                    dataType:"json",
                    contentType:"application/json",
                    data:JSON.stringify(saveDataAry),
                    //data:data1,
                    success:function(data){
                        alert(data[0].username);
                    }
                });
            });
</script>
</body>
</html>
