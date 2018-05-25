package com.dao;

import java.util.List;

import com.pojo.WxAccount;


public interface WxAccountMapperDao {
	
	public List<WxAccount> selectListSelective(WxAccount wxAccount);
	
	public void say();

}
