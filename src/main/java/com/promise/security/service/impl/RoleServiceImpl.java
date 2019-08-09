package com.promise.security.service.impl;

import com.promise.security.entity.Role;
import com.promise.security.dao.RoleMapper;
import com.promise.security.service.RoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
