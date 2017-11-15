package cn.uc.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.yiqibang.bean.Type;
import cn.uc.yiqibang.dao.TypeDao;
import cn.uc.yiqibang.dao.impl.TypeDaoImpl;
import cn.uc.yiqibang.utils.Result;

public class TypeTest {
	TypeDao typeDao = new TypeDaoImpl();
	@Ignore
	@Test
	public void getAllType() {
		Result result = typeDao.getAllType();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void getTypeById(){
		Result result = typeDao.getTypeById(1);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void insertType(){
		Type type = new Type();
		type.setT_name("资讯");
		Result result = typeDao.insertType(type);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void updateType(){
		Type type = new Type();
		type.setId(4);
		type.setT_name("军事111");
		Result result = typeDao.updateType(type);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void deleteType(){
		Result result = typeDao.deteleType(4);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
}
