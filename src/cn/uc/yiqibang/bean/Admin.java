package cn.uc.yiqibang.bean;

import java.io.Serializable;

/**
 * ����Ա��JavaBean
 * @author ҶԶ��
 *
 */
public class Admin implements Serializable{
	
	/**
	 * ����id
	 */
	private Integer id;
	/**
	 * ����Ա�������û�������id
	 */
	private Integer t_u_Id;
	/**
	 * ����Ա��״̬
	 */
	private Boolean u_State;
	/**
	 * ����Ա�ȼ�
	 */
	private String u_Level;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getT_u_Id() {
		return t_u_Id;
	}
	public void setT_u_Id(Integer t_u_Id) {
		this.t_u_Id = t_u_Id;
	}
	public Boolean getU_State() {
		return u_State;
	}
	public void setU_State(Boolean u_State) {
		this.u_State = u_State;
	}
	public String getU_Level() {
		return u_Level;
	}
	public void setU_Level(String u_Level) {
		this.u_Level = u_Level;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", t_u_Id=" + t_u_Id + ", u_State=" + u_State + ", u_Level=" + u_Level + "]";
	}
	
}