package cn.zte.smbms.pojo;

import java.math.BigInteger;
import java.util.Date;
/**
 * ��ɫ��
 * @author bin
 *
 */
public class Role {
	private BigInteger id;//����ID
	private String roleCode;//��ɫ����
	private String roleName;//��ɫ����
	private BigInteger createdBy;//������
	private Date creationDate;//����ʱ��
	private BigInteger modifyBy;//�޸���
	private Date modifyDate;//�޸�ʱ��
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public BigInteger getCreatedBy() {
		return createdBy;
	} 
	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public BigInteger getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(BigInteger modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
