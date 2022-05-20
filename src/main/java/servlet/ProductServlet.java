package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import service.ProductService;

@WebServlet("/check") //「/${context}/check」というURLに紐づく
public class ProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//    // TODO Auto-generated method stub
	//    response.getWriter().append("Served at: ").append(request.getContextPath());
	//  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String id = request.getParameter("product_id");  //パラメーターを取得し、変数に代入
		int ID = 0;
		if(!id.equals("")) { //idが空じゃないときにIDに代入される
			ID = Integer.parseInt(id);// ProductServiceのauthenticationの引数と
		}
		System.out.println(id);  //確認用のログ（コンソールに出力されるもの）//ブラウザーには出力されない
		ProductService ps= new ProductService();
		Product result = ps.authentication(ID);
		//

		request.setAttribute("id", result);  //リクエストスコープに値を設定.
		//Servletで処理を実行しJSPに処理結果を引き渡して表示させる。その引き渡しにリクエストスコープが利用されている。
		//if(result.equals(null) || id.equals("")) {
		if(result == null || "".equals(id)) {
			if("".equals(id)) {
				request.setAttribute("i","product_idを入力してください");
			}else {
				request.setAttribute("i","対象のデータはありません");
			}


			request.getRequestDispatcher("/top.jsp").forward(request, response);
		} else
			request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
		//getRequestDispatcherで、処理結果をsearchResult.jspに返す


		//Servletからtopに戻る命令を記述


	}

}

