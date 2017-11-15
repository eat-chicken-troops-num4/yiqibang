package cn.uc.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.yiqibang.bean.News;
import cn.uc.yiqibang.dao.NewsDao;
import cn.uc.yiqibang.dao.impl.NewsDaoImpl;
import cn.uc.yiqibang.utils.Result;

public class NewsTest {
	
	NewsDao newsDao = new NewsDaoImpl();
//	@Ignore
	@Test
	public void getAllNews() {
		Result result = newsDao.getAllNews();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void getNewsById(){
		Result result = newsDao.getNewsById(1);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void insertNews(){
		News news = new News();
		news.setT_t_id(1);
		news.setN_title("二狗99");
		news.setN_source("搜狐新闻");
		news.setN_content("二狗子的故事");
		news.setN_createtime(new Date());
		news.setN_content("dsadsa");
		news.setN_readcount(0);
		news.setN_author("tshuo");
		news.setN_sharecount(0);
		news.setN_ifhot(0);
		news.setN_ifreport(0);
		Result result = newsDao.insertNews(news);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void updateNews(){
		News news = new News();
		news.setId(8);
		news.setT_t_id(1);
		news.setN_title("二狗777");
		news.setN_source("搜狐新闻777");
		news.setN_content("二狗子的故事777");
		news.setN_createtime(new Date());
		news.setN_content("dsadsa777");
		news.setN_readcount(0);
		news.setN_author("tshuo777");
		news.setN_sharecount(0);
		news.setN_ifhot(0);
		news.setN_ifreport(0);
		Result result = newsDao.updateNews(news);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void deleteNews(){
		Result result = newsDao.deleteNews(8);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
}
