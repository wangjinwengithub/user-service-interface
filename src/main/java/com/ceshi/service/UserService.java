package com.ceshi.service;

import java.util.List;

import com.ceshi.bean.UserAddress;

/**
 * 
 * @author lfy
 *
 */
public interface UserService {
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
