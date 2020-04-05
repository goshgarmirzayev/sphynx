package com.brotherhood.com.sphynx.service.impl;
import com.brotherhood.com.sphynx.entity.Post;
import org.springframework.stereotype.Service;
import java.util.List;
import com.brotherhood.com.sphynx.dao.PostDAOInter;
import com.brotherhood.com.sphynx.service.inter.PostServiceInter;
import org.springframework.beans.factory.annotation.Autowired;@Service 
public class PostServiceImpl implements PostServiceInter{

@Autowired
PostDAOInter aPostDaoInter;
@Override
public List<Post> findAll() {
return (List<Post>)aPostDaoInter.findAll();
}
@Override
public Post findById(Integer id) {
return aPostDaoInter.findById(id).get();
}
@Override
public Post save(Post vPost) {
 return aPostDaoInter.save(vPost);
}
@Override
public int deleteById(Integer id) {aPostDaoInter.deleteById(id);
 return 0;
}
}