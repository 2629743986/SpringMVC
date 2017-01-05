package com.wangjie.spring.dao;

import com.wangjie.spring.model.TBRoleMenu;

public interface TBRoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBRoleMenu record);

    int insertSelective(TBRoleMenu record);

    TBRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBRoleMenu record);

    int updateByPrimaryKey(TBRoleMenu record);
}