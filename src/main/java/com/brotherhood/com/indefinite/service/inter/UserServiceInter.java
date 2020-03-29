package com.brotherhood.com.indefinite.service.inter;



import com.brotherhood.com.indefinite.entity.User;

import java.util.List;

public interface UserServiceInter {
    public User findById(Integer id);

    public List<User> findAll();

    public int save(User user);

    public User update(com.brotherhood.com.indefinite.bean.User user);
}
