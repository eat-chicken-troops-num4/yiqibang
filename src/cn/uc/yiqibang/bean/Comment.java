package cn.uc.yiqibang.bean;

import java.util.Date;

public class Comment {

	private Integer id;
	/*
	 * 新闻id
	 */
	private Integer t_n_id;
	/*
	 * 用户id
	 */
	private Integer t_u_id;
	/*
	 * 评论内容
	 */
	private String c_content;
	/*
	 * 评论时间
	 */
	private Date c_createtime;
	/*
	 * 评论点赞人数
	 */
	private Integer c_thumbscount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getT_n_id() {
		return t_n_id;
	}
	public void setT_n_id(Integer t_n_id) {
		this.t_n_id = t_n_id;
	}
	public Integer getT_u_id() {
		return t_u_id;
	}
	public void setT_u_id(Integer t_u_id) {
		this.t_u_id = t_u_id;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public Date getC_createtime() {
		return c_createtime;
	}
	public void setC_createtime(Date c_createtime) {
		this.c_createtime = c_createtime;
	}
	public Integer getC_thumbscount() {
		return c_thumbscount;
	}
	public void setC_thumbscount(Integer c_thumbscount) {
		this.c_thumbscount = c_thumbscount;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", t_n_id=" + t_n_id + ", t_u_id=" + t_u_id + ", c_content=" + c_content
				+ ", c_createtime=" + c_createtime + ", c_thumbscount=" + c_thumbscount + "]";
	}
	
}
