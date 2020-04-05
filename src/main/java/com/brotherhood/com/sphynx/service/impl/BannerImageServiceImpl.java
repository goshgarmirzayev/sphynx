package com.brotherhood.com.sphynx.service.impl;

import com.brotherhood.com.sphynx.entity.BannerImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.brotherhood.com.sphynx.dao.BannerImageDAOInter;
import com.brotherhood.com.sphynx.service.inter.BannerImageServiceInter;

@Service
public class BannerImageServiceImpl implements BannerImageServiceInter {

    @Autowired
    BannerImageDAOInter aBannerImageDaoInter;

    @Override
    public List<BannerImage> findAll() {
        return (List<BannerImage>) aBannerImageDaoInter.findAll();
    }

    @Override
    public BannerImage findById(Integer id) {
        return aBannerImageDaoInter.findById(id).get();
    }

    @Override
    public BannerImage save(BannerImage vBannerImage) {
        return aBannerImageDaoInter.save(vBannerImage);
    }

    @Override
    public int deleteById(Integer id) {
        aBannerImageDaoInter.deleteById(id);
        return 0;
    }
}