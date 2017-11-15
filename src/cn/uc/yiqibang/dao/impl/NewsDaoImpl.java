package cn.uc.yiqibang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.News;
import cn.uc.yiqibang.dao.NewsDao;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class NewsDaoImpl implements NewsDao{
	Result result = new Result();
	@Override
	public Result getAllNews() {
		
		SqlSession session = MyBatisUtils.openSession();
		List<News> newsList= session.selectList(Constants.newsMapper_selectAll);
		session.close();
		if(newsList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(newsList);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}
	
//	public static void main(String[] args) {
//		Result result= new NewsDaoImpl().getAllNews();
//		System.out.println(result);
//	}

	@Override
	public Result getNewsById(int id) {
		SqlSession session = MyBatisUtils.openSession();
		List<News> newsList= session.selectList(Constants.newsMapper_selectById,id);
		session.close();
		if(newsList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(newsList);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result insertNews(News news) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.insert(Constants.newsMapper_insert,news);
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
	public Result updateNews(News news) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.update(Constants.newsMapper_update,news);
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
	public Result deleteNews(int id) {
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.newsMapper_delete,id);
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
