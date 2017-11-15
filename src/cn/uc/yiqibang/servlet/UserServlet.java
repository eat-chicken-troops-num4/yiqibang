package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	    //插入一条评论
		public void adminInsertUser(HttpServletRequest request,HttpServletResponse response){
			String user=request.getParameter("User");
			System.out.println("执行插入用户操作");
			PrintWriter out=null;
			try {
			    out =response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println("插入成功:"+user);
		}
		
		
		//删除一条评论
		public void adminDeleteUser(HttpServletRequest request,HttpServletResponse response){
			String userId=request.getParameter("userId");
			System.out.println("执行删除评论操作，要删除的评论Id为："+userId);
			PrintWriter out=null;
			try {
			    out =response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println("删除成功");
		}

}
