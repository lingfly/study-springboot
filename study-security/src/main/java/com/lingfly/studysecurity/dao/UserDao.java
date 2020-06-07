package com.lingfly.studysecurity.dao;

import com.lingfly.studysecurity.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
