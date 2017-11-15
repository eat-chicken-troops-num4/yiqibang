package cn.uc.yiqibang.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.yiqibang.dao.TypeDao;
import cn.uc.yiqibang.dao.impl.TypeDaoImpl;
import cn.uc.yiqibang.utils.Result;
import cn.uc.yiqibang.utils.WriteResultToClient;

/**
 * Servlet implementation class TypeServlet
 */
@WebServlet("/TypeServlet")
public class TypeServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
   TypeDao typeDao = new TypeDaoImpl();
   
   public void getTypeById(HttpServletRequest request,HttpServletResponse response){
	   int typeid = Integer.parseInt(request.getParameter("id"));
	   Result result = typeDao.getTypeById(typeid);
	   WriteResultToClient.writeMethod(result, response);
   }
}
