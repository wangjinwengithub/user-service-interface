package com.ceshi.service;

import java.util.List;

import com.ceshi.bean.UserAddress;

public interface OrderService2 {
	
	/**
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
