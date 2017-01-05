package com.wangjie.spring.dao;

import com.wangjie.spring.model.TBUserRole;

public interface TBUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBUserRole record);

    int insertSelective(TBUserRole record);

    TBUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBUserRole record);

    int updateByPrimaryKey(TBUserRole record);
}