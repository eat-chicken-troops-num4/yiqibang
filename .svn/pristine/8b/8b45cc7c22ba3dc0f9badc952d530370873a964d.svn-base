package cn.uc.yiqibang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.News;
import cn.uc.yiqibang.bean.Type;
import cn.uc.yiqibang.dao.TypeDao;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class TypeDaoImpl implements TypeDao{
	
	Result result = new Result();
	/**
	 * 查询所有新闻类型
	 */
	@Override
	public Result getAllType() {
		
		SqlSession session = MyBatisUtils.openSession();
		List<Type> typeList = session.selectList(Constants.typeMapper_selectAll);
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
	
	/**
	 * 根据id查询
	 */
	@Override
	public Result getTypeById(int id) {
		SqlSession session = MyBatisUtils.openSession();
		List<Type> typeList = session.selectList(Constants.typeMapper_selectById,id);
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
	public Result insertType(Type type) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.insert(Constants.typeMapper_insert,type);
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
	public Result updateType(Type type) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.update(Constants.typeMapper_update,type);
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
	public Result deteleType(int id) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.typeMapper_delete,id);
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
