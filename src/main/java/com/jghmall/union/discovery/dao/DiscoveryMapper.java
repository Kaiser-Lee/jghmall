package com.jghmall.union.discovery.dao;


import java.util.HashMap;
import java.util.List;

import com.jghmall.union.discovery.entity.Discovery;

public interface DiscoveryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Discovery record);

    int insertSelective(Discovery record);

    Discovery selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Discovery record);

    int updateByPrimaryKey(Discovery record);
    
    List<String> queryForList();
    
    List<String> getListByContent(String contentText);
}