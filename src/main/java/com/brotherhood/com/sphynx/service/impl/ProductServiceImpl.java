package com.brotherhood.com.sphynx.service.impl;

import com.brotherhood.com.sphynx.entity.Product;
import com.brotherhood.com.sphynx.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.brotherhood.com.sphynx.dao.ProductDAOInter;

@Service
public class ProductServiceImpl implements ProductServiceInter {

    @Autowired
    ProductDAOInter aProductDaoInter;

    @Override
    public List<Product> findAll() {
        return (List<Product>) aProductDaoInter.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return aProductDaoInter.findById(id).get();
    }

    @Override
    public Product save(Product vProduct) {
        return aProductDaoInter.save(vProduct);
    }

    @Override
    public int deleteById(Integer id) {
        aProductDaoInter.deleteById(id);
        return 0;
    }
}