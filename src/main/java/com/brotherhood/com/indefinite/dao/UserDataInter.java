package com.brotherhood.com.indefinite.dao;

import com.brotherhood.com.indefinite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataInter extends JpaRepository<User, Integer> {
    User findByEmailAndEnabled(String email, boolean enabled);

    User findByEmail(String email);
}
