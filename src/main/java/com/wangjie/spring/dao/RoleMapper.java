package com.wangjie.spring.dao;

import com.wangjie.spring.model.Role;

public interface RoleMapper {
    int insert(Role record);
    int insertSelective(Role record);
}