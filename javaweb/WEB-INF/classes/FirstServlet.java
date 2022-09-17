// 4つのパッケージをインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// マッピング名を指定
@WebServlet("/first")
public class FirstServlet extends HttpServlet {	// HttpServletクラスを継承
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {		// doGet()をオーバーライド

		// コンテンツタイプを指定
		res.setContentType("text/html;charset=utf-8");

		// PrintWriterを取得
		PrintWriter out = res.getWriter();

		// PrintWriterで出力
		out.println("<html>");
		out.println("<head>");
		out.println("<title>はじめてのサーブレット</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>サーブレットを始めよう</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}

