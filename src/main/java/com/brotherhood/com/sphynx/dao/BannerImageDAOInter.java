package com.brotherhood.com.sphynx.dao;
import com.brotherhood.com.sphynx.entity.BannerImage;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface BannerImageDAOInter extends CrudRepository<BannerImage, Integer> {

}