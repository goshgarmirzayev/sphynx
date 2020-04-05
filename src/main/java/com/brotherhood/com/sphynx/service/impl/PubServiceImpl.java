package com.brotherhood.com.sphynx.service.impl;

import com.brotherhood.com.sphynx.entity.Pub;
import com.brotherhood.com.sphynx.service.inter.PubServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.brotherhood.com.sphynx.dao.PubDAOInter;

@Service
public class PubServiceImpl implements PubServiceInter {

    @Autowired
    PubDAOInter aPubDaoInter;

    @Override
    public List<Pub> findAll() {
        return (List<Pub>) aPubDaoInter.findAll();
    }

    @Override
    public Pub findById(Integer id) {
        return aPubDaoInter.findById(id).get();
    }

    @Override
    public Pub save(Pub vPub) {
        return aPubDaoInter.save(vPub);
    }

    @Override
    public int deleteById(Integer id) {
        aPubDaoInter.deleteById(id);
        return 0;
    }
}