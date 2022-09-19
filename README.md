# JSP/サーブレット
## フォルダ構成
```
tomcat
  + webapps
    + javaweb(コンテキストルート)
      + HTML, JSP, 画像等(参照可)
      + WEB-INF(参照不可)
        + classes(クラスファイル置き場)
            :
```
## コンパイル手順
```
# 環境変数 $CATALINA_HOME の設定
$ export CATALINA_HOME=/home/ubuntu/tomcat

# コンパイル(クラスパスを指定する)
$ javac -classpath $CATALINA_HOME/lib/servlet-api.jar FirstServlet.java
```
## 実行手順
1. ファイルを格納
```
FirstServlet.class を tomcat/webapps/javaweb/WEB-INF/classes 配下に格納する。
```
2. tomcat起動
```
tomcat/bin/startup.sh
```
3. ブラウザで実行
```
URL : http://localhost:8080/javaweb/first
javaweb : コンテキストルート
first : マッピング名
```
4. tomcat終了
```
tomcat/bin/shutdown.sh
```
