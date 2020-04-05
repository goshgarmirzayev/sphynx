package com.brotherhood.com.sphynx.dao;
import com.brotherhood.com.sphynx.entity.Pub;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface PubDAOInter extends CrudRepository<Pub, Integer> {

}