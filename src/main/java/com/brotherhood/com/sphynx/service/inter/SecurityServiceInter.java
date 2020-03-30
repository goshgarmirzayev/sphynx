package com.brotherhood.com.sphynx.service.inter;


import com.brotherhood.com.sphynx.bean.CustomUserDetail;
import org.springframework.stereotype.Service;

@Service
public interface SecurityServiceInter {

     CustomUserDetail getLoggedInUserDetails();

     void reloadRoles();
}
