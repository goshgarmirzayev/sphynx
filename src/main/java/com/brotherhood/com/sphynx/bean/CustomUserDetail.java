package com.brotherhood.com.sphynx.bean;

import com.brotherhood.com.sphynx.entity.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomUserDetail extends org.springframework.security.core.userdetails.User {
    private com.brotherhood.com.sphynx.entity.User user;

    public CustomUserDetail(com.brotherhood.com.sphynx.entity.User user, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

}
