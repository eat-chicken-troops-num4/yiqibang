package cn.uc.yiqibang.bean;

import java.util.Date;

/**
 * 新闻表 实体类
 * @author tshuo
 *
 */
public class News {

	private int id;
	private int t_t_id;
	/*
	 * 标题
	 */
	private String n_title;
	/*
	 * 来源
	 */
	private String n_source;
	/*
	 * 内容
	 */
	private String n_content;
	/*
	 * 创建时间
	 */
	private Date n_createtime;
	/*
	 * 评论人数
	 */
	private int n_commcount;
	/*
	 * 已读人数
	 */
	private int n_readcount;
	/*
	 * 作者
	 */
	private String n_author;
	/*
	 * 分享人数
	 */
	private int n_sharecount;
	/*
	 * 是否热点
	 */
	private int n_ifhot;
	/*
	 * 是否被举报
	 */
	private int n_ifreport;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getT_t_id() {
		return t_t_id;
	}
	public void setT_t_id(int t_t_id) {
		this.t_t_id = t_t_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_source() {
		return n_source;
	}
	public void setN_source(String n_siyrce) {
		this.n_source = n_siyrce;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public Date getN_createtime() {
		return n_createtime;
	}
	public void setN_createtime(Date n_createtime) {
		this.n_createtime = n_createtime;
	}
	public int getN_commcount() {
		return n_commcount;
	}
	public void setN_commcount(int n_commcount) {
		this.n_commcount = n_commcount;
	}
	public int getN_readcount() {
		return n_readcount;
	}
	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}
	public String getN_author() {
		return n_author;
	}
	public void setN_author(String n_author) {
		this.n_author = n_author;
	}
	public int getN_sharecount() {
		return n_sharecount;
	}
	public void setN_sharecount(int n_sharecount) {
		this.n_sharecount = n_sharecount;
	}
	public int getN_ifhot() {
		return n_ifhot;
	}
	public void setN_ifhot(int n_ifhot) {
		this.n_ifhot = n_ifhot;
	}
	public int getN_ifreport() {
		return n_ifreport;
	}
	public void setN_ifreport(int n_ifreport) {
		this.n_ifreport = n_ifreport;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", t_t_id=" + t_t_id + ", n_title=" + n_title + ", n_source=" + n_source
				+ ", n_content=" + n_content + ", n_createtime=" + n_createtime + ", n_commcount=" + n_commcount
				+ ", n_readcount=" + n_readcount + ", n_author=" + n_author + ", n_sharecount=" + n_sharecount
				+ ", n_ifhot=" + n_ifhot + ", n_ifreport=" + n_ifreport + "]";
	}
	
}
