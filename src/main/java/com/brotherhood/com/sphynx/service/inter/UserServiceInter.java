package com.brotherhood.com.sphynx.service.inter;



import com.brotherhood.com.sphynx.entity.User;

import java.util.List;

public interface UserServiceInter {
    public User findById(Integer id);

    public List<User> findAll();

    public int save(User user);

    public User update(com.brotherhood.com.sphynx.bean.User user);
}
