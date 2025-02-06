package com.project.learning.repositries;

import com.project.learning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findAllByMobile(String mobile);
}
