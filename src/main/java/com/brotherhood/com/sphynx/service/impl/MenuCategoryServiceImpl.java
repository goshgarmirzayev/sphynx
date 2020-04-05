package com.brotherhood.com.sphynx.service.impl;

import com.brotherhood.com.sphynx.entity.MenuCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.brotherhood.com.sphynx.dao.MenuCategoryDAOInter;
import com.brotherhood.com.sphynx.service.inter.MenuCategoryServiceInter;

@Service
public class MenuCategoryServiceImpl implements MenuCategoryServiceInter {

    @Autowired
    MenuCategoryDAOInter aMenuCategoryDaoInter;

    @Override
    public List<MenuCategory> findAll() {
        return (List<MenuCategory>) aMenuCategoryDaoInter.findAll();
    }

    @Override
    public MenuCategory findById(Integer id) {
        return aMenuCategoryDaoInter.findById(id).get();
    }

    @Override
    public MenuCategory save(MenuCategory vMenuCategory) {
        return aMenuCategoryDaoInter.save(vMenuCategory);
    }

    @Override
    public int deleteById(Integer id) {
        aMenuCategoryDaoInter.deleteById(id);
        return 0;
    }
}