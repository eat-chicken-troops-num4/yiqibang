package cn.uc.yiqibang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.User;
import cn.uc.yiqibang.dao.IUserDao;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;



public class UserDaoImpl implements IUserDao{

	@Override
	public Result insertUser(User user) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
	    int row = session.insert(Constants.userMapper_insert,user);
	    session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(user);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result deleteUser(int userId) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.userMapper_delete,userId);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(userId);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result updateUser(User user) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.update(Constants.userMapper_update,user);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(user);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result queryAllUser() {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		List<User> userList = session.selectList(Constants.userMapper_queryAll);
		session.close();
		if(userList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(userList);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	
}

	@Override
	public Result queryById(int userId) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		User user = session.selectOne(Constants.userMapper_queryById,userId);
		session.close();
		if(user!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(user);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

}
