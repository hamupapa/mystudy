<%@page contentType="text/html;charset=utf-8" %>
<html>
    <head>
        <title>確認画面</title>
    </head>
    <body>
        <h2>入力情報を確認して登録ボタンを押してください</h2>
        氏名：<strong><%= request.getParameter("name") %></strong><br/>
        パスワード：<strong><%= request.getParameter("pass") %></strong><br/>
        年齢：<srong><%= request.getAttribute("age") %></srong><br/>
        開発経験：<strong><%= request.getAttribute("langs") %></strong><br/>
        住所：<strong><%= request.getParameter("address") %></strong><br/>
        ご意見・お問い合わせ：<br/><strong><%= request.getParameter("msg")%></strong><br/>
        <input type="submit" value="登録" />
        <input type="reset" value="戻る" /><br/><br/>
        （この画面はJSPで出力しています）
    </body>
</html>
