package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biz.WxAccountMapperBiz;
import com.pojo.WxAccount;

@Controller
public class MyController {

	@Autowired
//	@Qualifier("wxAccountMapperBiz")
	private WxAccountMapperBiz wxAccountMapperBiz;

	@RequestMapping(value = "/first_1", method = RequestMethod.GET)
	public ModelAndView firstC() {
		// @RequestParam(value = "name", defaultValue = "news2") String name,
		System.out.println("/controller/first_1");
		ModelAndView modelAndView = new ModelAndView("first_1.jsp");
		WxAccount wxAccount = new WxAccount();
		List<WxAccount> list = wxAccountMapperBiz.selectListSelective(wxAccount);

		for (WxAccount wxAccount2 : list) {
			System.out.println(wxAccount2.toString());
		}

		// String name = request.getParameter("name");
		// System.out.println(list.size() + "<<>>:" + name);

		return modelAndView;

	}

	@RequestMapping(value = "/ok/{name}", method = RequestMethod.GET)
	public String view(@PathVariable String name) {
		System.out.println("controller:" + name);
		return "/ok.jsp";

	}

}
