package com.brotherhood.com.sphynx.service.inter;

import com.brotherhood.com.sphynx.entity.Post;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface PostServiceInter{
List<Post> findAll();
Post findById(Integer id);
Post save(Post vPost);
int deleteById(Integer id);
}