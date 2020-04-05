package com.brotherhood.com.sphynx.dao;
import com.brotherhood.com.sphynx.entity.Post;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface PostDAOInter extends CrudRepository<Post, Integer> {

}