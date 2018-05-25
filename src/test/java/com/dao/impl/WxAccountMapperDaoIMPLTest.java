package com.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ApplicationContext;
import com.dao.WxAccountMapperDao;
import com.pojo.WxAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContext.class)
public class WxAccountMapperDaoIMPLTest {

	@Autowired
	private WxAccountMapperDao wxAccountMapperDao;

	@Test
	public void testSelectListSelective() {
		wxAccountMapperDao.say();
	}

}
