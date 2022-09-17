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
## 実行手順
1. ファイルを格納
2. tomcat起動
```
tomcat\bin\startup.bat
または
tomcat/bin/startup.sh
```
3. ブラウザで実行
```
http://localhost:8080/(コンテキストルート名)/～
```
4. tomcat終了
```
tomcat\bin\shutdown.bat
または
tomcat/bin/shutdown.sh
```
