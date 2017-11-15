package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.News;
import cn.uc.yiqibang.utils.Result;

public interface NewsDao {
	/*
	 * 获取所有新闻
	 */
	Result getAllNews();
	/*
	 * 按id查询新闻
	 */
	Result getNewsById(int id);
	/*
	 * 添加新闻
	 */
	Result insertNews(News news);
	/*
	 * 修改
	 */
	Result updateNews(News news);
	/*
	 * 删除
	 */
	Result deleteNews(int id);
}
