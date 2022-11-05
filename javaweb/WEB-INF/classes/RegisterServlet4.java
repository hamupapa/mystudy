import bean.RegisterBean;
import java.io.*;
import java.rmi.ServerException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// コンパイルエラー発生
// パッケージbeanが見つからない
// 環境変数がおかしい？

@WebServlet("/register4")
public class RegisterServlet4 extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServerException {
        // リクエストの文字コード指定
        req.setCaracterEncoding("utf-8");

        // 入力情報の取得
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String[] langs = req.getParameterValues("lang");
        res.setContentType("text/html;charset=utf-8");

        // Beanの作成
        RegisterBean rb = new RegisterBean();
        rb.setName(name);
        rb.setAge(age);
        rb.setLangs(langs);

        // Beanをリクエストに格納
        req.setAttribute("rb", rb);

        // register4.jspへフォワード
        RequestDispatcher rd = req.getRequestDispatcher("/register4.jsp");
        rd.forward(req, res);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        doPost(req, res);
    }
}
