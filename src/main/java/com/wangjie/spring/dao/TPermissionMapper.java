package com.wangjie.spring.dao;

import com.wangjie.spring.model.TPermission;

public interface TPermissionMapper {
    int insert(TPermission record);

    int insertSelective(TPermission record);
}