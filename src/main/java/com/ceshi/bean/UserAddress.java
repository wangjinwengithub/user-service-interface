package com.ceshi.bean;

import java.io.Serializable;

/**
 * 閻€劍鍩涢崷鏉挎絻
 * @author lfy
 *
 */
public class UserAddress implements Serializable {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id="+id+",userAddress="+userAddress+",userId="+userId+",consignee="+consignee+",phoneNum="+phoneNum+",isDefault="+isDefault;
	}
	private Integer id;
    private String userAddress; 
    private String userId; 
    private String consignee; 
    private String phoneNum; 
    private String isDefault; 
    
    public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum,
			String isDefault) {
		super();
		this.id = id;
		this.userAddress = userAddress;
		this.userId = userId;
		this.consignee = consignee;
		this.phoneNum = phoneNum;
		this.isDefault = isDefault;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
    
    


}
