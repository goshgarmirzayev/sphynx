package com.brotherhood.com.indefinite.service.inter;


import com.brotherhood.com.indefinite.bean.CustomUserDetail;
import org.springframework.stereotype.Service;

@Service
public interface SecurityServiceInter {

     CustomUserDetail getLoggedInUserDetails();

     void reloadRoles();
}
