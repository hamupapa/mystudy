//----------------------------------------------------
// ファイル名：RegisterServlet.java
// 処理概要　：register.htmlで入力した登録情報をブラウザ上へ表示する
//----------------------------------------------------
// 4つのパッケージをインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// マッピング名を指定
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {	// HttpServletクラスを継承
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド

		// コンテンツタイプを指定
		res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		// PrintWriterを取得
		PrintWriter out = res.getWriter();

		// PrintWriterで出力
		out.println("<html>");
		out.println("<head>");
		out.println("<title>確認画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>入力情報を確認して登録ボタンを押してください</h2>");
		out.println("氏名：<strong>" + req.getParameter("name") + "</strong><br/>");
		out.println("パスワード：<strong>" + req.getParameter("pass") + "</strong><br/>");
		String age = req.getParameter("age");
		if(age.equals("child")) {
			age = "18歳未満";
		} else {
			age = "18歳以上";
		}
		out.println("年齢：<strong>" + age + "</strong><br/>");
		String[] langs = req.getParameterValues("lang");
		out.println("開発経験：<strong>");
		for(int i=0; i<langs.length; i++) {
			out.println(langs[i] + " ");
		}
		out.println("</strong><br/>");
		out.println("住所：<strong>" + req.getParameter("address") + "</strong><br/>");
		out.println("ご意見・お問い合わせ：<br/><strong>" + req.getParameter("msg") + "</strong><br/>");
		out.println("<input type=\"submit\" value=\"登録\" />");
		out.println("<input type=\"reset\" value=\"取消\" /><br/>");
		out.println("（この画面はサーブレットで出力しています）");
		out.println("</body>");
		out.println("</html>");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド
		doPost(req, res);
	}
}

