<!-- ディレクティブタグ -->
<%@page contentType="text/html;charset=utf-8" %>
<!-- 宣言タグ -->
<%!
    String fortune(){
        String f;
        double fn = Math.random();  // 0.0～1.0の乱数
        if(fn >= 0.7) {
            f = "大吉";
        }
        else if(fn >= 0.4) {
            f = "中吉";
        }
        else if(fn >= 0.1) {
            f = "小吉";
        }
        else {
            f = "凶";
        }
        return f;
    }
%>
<html>
    <head>
        <title>占いJSP</title>
    </head>
    <body>
        <h1>JSPで占い！</h1>
        あなたの今日と明日の運勢は・・・<br/>
        <% for(int i=0; i<2; i++) { %>
            <strong><%= fortune() %></strong><br/>
        <% } %>
    </body>
</html>
