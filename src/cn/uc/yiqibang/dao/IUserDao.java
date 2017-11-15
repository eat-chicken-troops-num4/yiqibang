package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.User;
import cn.uc.yiqibang.utils.Result;

public interface IUserDao {

    // 增加用户
	Result insertUser(User user);
	
	// 删除用户
	Result deleteUser(int userId);
	
	// 修改用户
	Result updateUser(User user);
	
	//查询所有用户
	Result queryAllUser();
	
	//根据id查询用户
	Result queryById(int userId);
}
