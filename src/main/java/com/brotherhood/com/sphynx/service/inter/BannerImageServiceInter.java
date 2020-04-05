package com.brotherhood.com.sphynx.service.inter;

import com.brotherhood.com.sphynx.entity.BannerImage;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface BannerImageServiceInter{
List<BannerImage> findAll();
BannerImage findById(Integer id);
BannerImage save(BannerImage vBannerImage);
int deleteById(Integer id);
}