package com.brotherhood.com.sphynx.service.inter;

import com.brotherhood.com.sphynx.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface ProductServiceInter{
List<Product> findAll();
Product findById(Integer id);
Product save(Product vProduct);
int deleteById(Integer id);
}