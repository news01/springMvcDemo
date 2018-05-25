package com.biz;

import java.util.List;

import com.pojo.WxAccount;


public interface WxAccountMapperBiz {
	public List<WxAccount> selectListSelective(WxAccount wxAccount);
	
	public void say();


}
