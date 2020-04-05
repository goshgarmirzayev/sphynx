package com.brotherhood.com.sphynx.dao;
import com.brotherhood.com.sphynx.entity.MenuCategory;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface MenuCategoryDAOInter extends CrudRepository<MenuCategory, Integer> {

}