package com.jghmall.union.discovery.service.impl;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jghmall.union.discovery.dao.DiscoveryMapper;
import com.jghmall.union.discovery.entity.Discovery;
import com.jghmall.union.discovery.service.DiscoveryService;

@Service
public class DiscoveryServiceImpl implements DiscoveryService{
	
	@Autowired
	private DiscoveryMapper discoveryMapper;
	
	@Override
	public Discovery findById(Long id) {
		// TODO Auto-generated method stub
		return discoveryMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<String> findList() {
		// TODO Auto-generated method stub
		return discoveryMapper.queryForList();
	}

	@Override
	public List<String> getListByContent(String content) {
		// TODO Auto-generated method stub
		return discoveryMapper.getListByContent(content);
	}
	
}
