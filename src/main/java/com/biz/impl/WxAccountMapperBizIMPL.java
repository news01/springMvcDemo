package com.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.biz.WxAccountMapperBiz;
import com.dao.WxAccountMapperDao;
import com.pojo.WxAccount;


//@Service("wxAccountMapperBiz")
@Component
public class WxAccountMapperBizIMPL implements WxAccountMapperBiz  {
	
	@Autowired
	private WxAccountMapperDao wxAccountMapperDao;

	public List<WxAccount> selectListSelective(WxAccount wxAccount) {
		List<WxAccount> wxAccounts = wxAccountMapperDao.selectListSelective(wxAccount);
		return wxAccounts;
	}

	@Override
	public void say() {
		System.out.println("dhfriduyfpisuhfdpiuhoooooooooooooooo");
		
	}

}
