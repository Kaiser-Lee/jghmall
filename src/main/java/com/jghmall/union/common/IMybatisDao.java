package com.jghmall.union.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IMybatisDao<T> {

    int deleteByPrimaryKey(Object id);

    int insert(T po);

    int insertSelective(T po);

    T selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(T po);

    int updateByPrimaryKey(T po);

//    int selectId(String name);
//
//    List<T> selectByCondition(T condition);
//
//    int updateByIdsSelective(@Param("po")T po, @Param("ids")List ids);

}
