package com.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.biz.WxAccountMapperBiz;
import com.pojo.WxAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MyControllerTest {

	@Autowired
	private WxAccountMapperBiz wxAccountMapperBiz;

	@Test
	public void testFirstC() {
		
		
		WxAccount wxAccount = new WxAccount();
		List<WxAccount> wxAccounts = wxAccountMapperBiz.selectListSelective(wxAccount);
		for (WxAccount wxAccount2 : wxAccounts) {
			System.out.println(wxAccount2.toString());
		}
	}

	@Test
	public void testView() {
		fail("Not yet implemented");
	}

}

