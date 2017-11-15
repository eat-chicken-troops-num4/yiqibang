package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.Type;
import cn.uc.yiqibang.utils.Result;

public interface TypeDao {
	/*
	 * 查询所有新闻类型
	 */
	Result getAllType();
	/*
	 * 按id查询
	 */
	Result getTypeById(int id);
	/*
	 * 添加新闻类型
	 */
	Result insertType(Type type);
	/*
	 * 更改新闻类型
	 */
	Result updateType(Type type);
	/*
	 * 删除新闻类型
	 */
	Result deteleType(int id);
}
