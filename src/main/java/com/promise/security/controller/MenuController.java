package com.promise.security.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.promise.security.entity.Menu;
import com.promise.security.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 菜单管理 前端控制器
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Menu> list() {
        menuService.selectList(null);
        EntityWrapper<Menu> menuEntityWrapper = new EntityWrapper<>();
        menuEntityWrapper.between("parent_id", 1, 5);
        List<Menu> menus = menuService.selectList(menuEntityWrapper);
        return menus;
    }


}

