package cn.uc.yiqibang.utils;

/**
 * 字符串的参数拼接类
 * @author ucai
 *
 */
public class Constants {

     //响应码
	 public static final int RETCODE_SUCCESS=0;
	 public static final int RETCODE_FAILED=2000;
	
	 //定义映射文件.xml的包的根路径
	 public static final String root="cn.uc.yiqibang.mapper";
	 //定义mapper映射文件的名称
	 public static final String adminMapper=".AdminMapper";
	 public static final String userMapper=".UserMapper";
	 public static final String commentMapper=".CommentMapper";
	 public static final String newsMapper=".NewsMapper";
	 public static final String typeMapper=".TypeMapper";
	 //定义操作的sql语句的id名称
	 public static final String selectAll=".selectAll";
	 public static final String selectById=".selectById";
	 public static final String selectByLike=".selectByLike";
	 public static final String queryById=".queryById";
	 public static final String queryAll=".queryAll";
	 public static final String insert=".insert";
	 public static final String delete=".delete";
	 public static final String update=".update";
	 
	 //Admin管理员的操作语句路径
	 public static final String adminMapper_queryById=root+adminMapper+queryById;
	 public static final String adminMapper_queryAll=root+adminMapper+queryAll;
	 public static final String adminMapper_insert=root+adminMapper+insert;
	 public static final String adminMapper_delete=root+adminMapper+delete;
	 public static final String adminMapper_update=root+adminMapper+update;
	 
	 //User用户的操作语句路径
	 public static final String userMapper_queryById=root+userMapper+queryById;
	 public static final String userMapper_queryAll=root+userMapper+queryAll;
	 public static final String userMapper_insert=root+userMapper+insert;
	 public static final String userMapper_delete=root+userMapper+delete;
	 public static final String userMapper_update=root+userMapper+update;
	 
	 //News新闻的操作语句路径
	 public static final String newsMapper_selectAll=root+newsMapper+selectAll;
	 public static final String newsMapper_selectById=root+newsMapper+selectById;
	 public static final String newsMapper_insert=root+newsMapper+insert;
	 public static final String newsMapper_update=root+newsMapper+update;
	 public static final String newsMapper_delete=root+newsMapper+delete;
	 
	 //Type新闻类型的操作语句路径
	 public static final String typeMapper_selectAll=root+typeMapper+selectAll;
	 public static final String typeMapper_selectById=root+typeMapper+selectById;
	 public static final String typeMapper_insert=root+typeMapper+insert;
	 public static final String typeMapper_update=root+typeMapper+update;
	 public static final String typeMapper_delete=root+typeMapper+delete;
	 
	 //Comment评论的操作语句路径
	 public static final String commentMapper_selectAll=root+commentMapper+selectAll;
	 public static final String commentMapper_selectById=root+commentMapper+selectById;
	 public static final String commentMapper_insert=root+commentMapper+insert;
	 public static final String commentMapper_update=root+commentMapper+update;
	 public static final String commentMapper_delete=root+commentMapper+delete;
}
