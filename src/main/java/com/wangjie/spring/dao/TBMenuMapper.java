package com.wangjie.spring.dao;

import com.wangjie.spring.model.TBMenu;

public interface TBMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBMenu record);

    int insertSelective(TBMenu record);

    TBMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBMenu record);

    int updateByPrimaryKey(TBMenu record);
}