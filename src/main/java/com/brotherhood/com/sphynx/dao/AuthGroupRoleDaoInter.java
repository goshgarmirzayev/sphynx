package com.brotherhood.com.sphynx.dao;

import com.brotherhood.com.sphynx.entity.AuthGroup;
import com.brotherhood.com.sphynx.entity.AuthGroupRole;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface AuthGroupRoleDaoInter extends CrudRepository<AuthGroupRole, Integer> {

    List<AuthGroupRole> findByGroupId(AuthGroup group);
}
