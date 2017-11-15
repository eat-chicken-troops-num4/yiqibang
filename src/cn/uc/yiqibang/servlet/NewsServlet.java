package cn.uc.yiqibang.servlet;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.yiqibang.dao.NewsDao;
import cn.uc.yiqibang.dao.impl.NewsDaoImpl;
import cn.uc.yiqibang.utils.Result;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/NewsServlet")
public class NewsServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	NewsDao newsDao = new NewsDaoImpl();
	
	public void getAllNews(HttpServletRequest request,HttpServletResponse response){
		System.out.println("getAllNews");
		Result result = newsDao.getAllNews();
		
		String jsonObj = JSONObject.fromObject(result).toString();
		
		try {
			response.getWriter().println(jsonObj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
