//----------------------------------------------------
// ファイル名：SessionServlet.java
// 処理概要　：セッションオブジェクトの使い方
//----------------------------------------------------
// パッケージをインポート
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// マッピング名を指定
@WebServlet("/session")
public class SessionServlet extends HttpServlet {	// HttpServletクラスを継承
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド

		// セッションオブジェクトを生成or取得
		HttpSession session = req.getSession(true);

		// セッションオブジェクトからcartを取得
		ArrayList<String> booklist = 
			(ArrayList<String>)session.getAttribute("cart");	// warningあり

		if(booklist == null) {	// 初回アクセス
			booklist = new ArrayList<String>();
		}
		else {	// 2回目以降
			req.setCharacterEncoding("utf-8");
			String book = req.getParameter("book");
			booklist.add(book);
		}
		// booklistをセッションオブジェクトに設定
		session.setAttribute("cart", booklist);

		// コンテンツタイプを指定
		res.setContentType("text/html;charset=utf-8");

		// PrintWriterを取得
		PrintWriter out = res.getWriter();

		// PrintWriterで出力
		out.println("<html>");
		out.println("<head>");
		out.println("<title>注文画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>商品を選択してください</h2>");
		out.println("<form action=\"/javaweb/session\" method=\"post\">");
		out.println("<select name=\"book\" size=\"1\">");
		out.println("<option value=\"Book書籍1\">Book書籍1</option>");
		out.println("<option value=\"Book書籍2\">Book書籍2</option>");
		out.println("<option value=\"Book書籍3\">Book書籍3</option>");
		out.println("</select>");
		out.println("<input type=\"submit\" value=\"追加\"/>");
		out.println("</form>");
		out.println("<h2>カートの中身</h2>");

		for(int i=0; i<booklist.size(); i++) {
			out.println(booklist.get(i) + "<br/>");
		}

		out.println("</body>");
		out.println("</html>");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doPost()をオーバーライド
		doPost(req, res);
	}
}

