package com.brotherhood.com.sphynx.dao;
import com.brotherhood.com.sphynx.entity.Product;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface ProductDAOInter extends CrudRepository<Product, Integer> {

}