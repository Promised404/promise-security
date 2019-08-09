package com.promise.security.service.impl;

import com.promise.security.entity.Menu;
import com.promise.security.dao.MenuMapper;
import com.promise.security.service.MenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
