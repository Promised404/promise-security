package com.promise.security.service.impl;

import com.promise.security.entity.RoleMenu;
import com.promise.security.dao.RoleMenuMapper;
import com.promise.security.service.RoleMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与菜单对应关系 服务实现类
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {

}
