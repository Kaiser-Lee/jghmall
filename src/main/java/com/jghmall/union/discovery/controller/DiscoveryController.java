package com.jghmall.union.discovery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jghmall.union.discovery.service.DiscoveryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.minidev.json.JSONUtil;

@Controller
@RequestMapping("/discovery")
@Api("动态接口")
public class DiscoveryController {
	
	@Autowired
	private DiscoveryService discoveryService;
	
	@ResponseBody
	@RequestMapping(value = "/dofindDiscoveryList",method = RequestMethod.GET)
	@ApiOperation(value = "动态信息列表")
	public Object dofindDiscoveryList() {
		return discoveryService.findList();
	}
	
	@ResponseBody
	@RequestMapping(value="getListByContent" ,method = RequestMethod.POST)
	@ApiOperation(value = "动态模糊查找")
	public Object getListByNick(@ApiParam("动态内容") @RequestParam(name="contentText") String contentText) {
		List<String> list = discoveryService.getListByContent(contentText);
		System.out.println(list);
		return list;
	}
	
	
	
	
	
	
	
}
