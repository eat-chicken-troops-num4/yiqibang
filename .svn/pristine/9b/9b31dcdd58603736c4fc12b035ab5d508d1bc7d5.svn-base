package cn.uc.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.yiqibang.bean.User;
import cn.uc.yiqibang.dao.IUserDao;
import cn.uc.yiqibang.dao.impl.UserDaoImpl;
import cn.uc.yiqibang.utils.Result;



public class UserTest {

	IUserDao userDao=new UserDaoImpl();
	@Ignore
	@Test
	public void insertTest() {
		User user0=new User();
		user0.setUserName("麻子222");
		user0.setNickName("王麻子222");
		user0.setPassword("12e422");
		user0.setBindtel("12324534535");
		user0.setAreaId(1);
		user0.setCityId(3);
		user0.setEmail("362267958@qq.com");
		user0.setProvinceId(2);
		user0.setRemark("这是王麻子的姓名");
		user0.setSex(false);
		Result result=userDao.insertUser(user0);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void deleteTest(){
		Result result=userDao.deleteUser(2); 
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void updateTest(){
		User user0=new User();
		user0.setId(1);
		user0.setUserName("麻子");
		user0.setNickName("王麻子");
		user0.setPassword("12e4");
		user0.setBindtel("12324534535");
		user0.setAreaId(1);
		user0.setCityId(3);
		user0.setEmail("362267958@qq.com");
		user0.setProvinceId(2);
		user0.setRemark("这是王麻子的姓名");
		user0.setSex(false);
		Result result=userDao.updateUser(user0);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void queryAllTest(){
		Result result=userDao.queryAllUser();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void queryByIdTest(){
		Result result=userDao.queryById(1);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
}
