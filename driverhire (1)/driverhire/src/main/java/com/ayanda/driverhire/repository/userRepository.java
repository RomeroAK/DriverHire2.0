package com.ayanda.driverhire.repository;

import com.ayanda.driverhire.user.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<SystemUser, Long> {

}
