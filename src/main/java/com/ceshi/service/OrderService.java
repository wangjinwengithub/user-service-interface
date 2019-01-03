package com.ceshi.service;

import java.util.List;

import com.ceshi.bean.UserAddress;

public interface OrderService {
	
	/**
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
