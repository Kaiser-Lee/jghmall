package com.jghmall.union.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jghmall.union.discovery.entity.Discovery;
import com.jghmall.union.discovery.service.DiscoveryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value="/main")
@Api("main主接口")
public class MainController {
	
	@Autowired
	private DiscoveryService discoveryService;
	
	@ResponseBody
	@ApiOperation(value = "动态实体")
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	public Object demo() {
		Discovery discovery = discoveryService.findById(1L);
		return discovery;
	}
}
