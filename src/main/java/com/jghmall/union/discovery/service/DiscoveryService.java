package com.jghmall.union.discovery.service;

import java.util.HashMap;
import java.util.List;

import com.jghmall.union.discovery.entity.Discovery;

public interface DiscoveryService {

	/**
	 * 通过id查找动态实体
	 * @param id
	 * @return
	 */
	public Discovery findById(Long id);
	
	/**
	 * 查找全部的动态信息
	 * @return
	 */
	public List<String> findList();
	
	/**
	 * 按用户的昵称（nick）模糊查找
	 * @param nick
	 * @return
	 */
	List<String> getListByContent(String content);
}
