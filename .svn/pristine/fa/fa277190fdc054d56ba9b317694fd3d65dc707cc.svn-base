package cn.uc.yiqibang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.Comment;
import cn.uc.yiqibang.bean.Type;
import cn.uc.yiqibang.dao.CommentDao;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class CommentDaoImpl implements CommentDao{

	@Override
	public Result getAllComment() {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		List<Comment> commentList = session.selectList(Constants.commentMapper_selectAll);
		session.close();
		if(commentList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(commentList);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result insertComment(Comment comment) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.insert(Constants.commentMapper_insert,comment);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(row);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result getCommentById(int id) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		List<Type> typeList = session.selectList(Constants.commentMapper_selectById,id);
		session.close();
		if(typeList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(typeList);
		}else {
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result deleteComment(int id) {
		Result result = new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.commentMapper_delete,id);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(row);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

}
