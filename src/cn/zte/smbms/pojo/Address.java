package cn.zte.smbms.pojo;

import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @author bin
 *��ַ��ϸ��
 */
public class Address {
	private BigInteger id;//����ID
	private String contact;//����
	private String addressDesc;//��ַ
	private String postCode;//�ʱ��
	private String tel;//�ֻ���
	private BigInteger createdBy;//������
	private Date creationDate;//��������ʱ��
	private BigInteger modifyBy;//�޸���
	private Date modifyDate;//�޸�ʱ��
	private BigInteger userId;//�û�ID
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddressDesc() {
		return addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	
}
