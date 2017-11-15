package cn.uc.yiqibang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.Admin;
import cn.uc.yiqibang.dao.IAdminDao;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class AdminDaoImpl implements IAdminDao{

	@Override
	public Result insertAdmin(Admin admin) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
	    int row = session.insert(Constants.adminMapper_insert,admin);
	    session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(admin);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result deleteAdmin(int adminId) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.adminMapper_delete,adminId);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(adminId);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result updateAdmin(Admin admin) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.update(Constants.adminMapper_update,admin);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(admin);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}

	@Override
	public Result queryAllAdmin() {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		List<Admin> adminList = session.selectList(Constants.adminMapper_queryAll);
		session.close();
		if(adminList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(adminList);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	
	}

	@Override
	public Result queryById(int adminId) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		Admin admin = session.selectOne(Constants.adminMapper_queryById,adminId);
		session.close();
		if(admin!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(admin);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;
	}
}
