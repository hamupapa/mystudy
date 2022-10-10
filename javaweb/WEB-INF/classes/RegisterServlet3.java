//----------------------------------------------------
// ファイル名：RegisterServlet3.java
// 処理概要　：register3.htmlで入力した登録情報をブラウザ上へ表示する
//----------------------------------------------------
// 4つのパッケージをインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// マッピング名を指定
@WebServlet("/register3")
public class RegisterServlet3 extends HttpServlet {	// HttpServletクラスを継承
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド

		//res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String age = req.getParameter("age");
		if(age.equals("child")) {
			age = "18歳未満";
		}
		else {
			age = "18歳以上";
		}
		req.setAttribute("age", age);

		String langs = "";
		String[] lang = req.getParameterValues("lang");
		for(int i=0; i<lang.length; i++) {
			langs = langs + lang[i] + " ";
		}
		req.setAttribute("langs", langs);

		RequestDispatcher rd = req.getRequestDispatcher("/register3.jsp");
		rd.forward(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド
		doPost(req, res);
	}
}

