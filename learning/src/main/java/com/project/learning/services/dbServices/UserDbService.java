package com.project.learning.services.dbServices;

import com.project.learning.dtos.UserDTO;
import com.project.learning.entities.User;
import com.project.learning.repositries.UserRepo;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.apache.kafka.common.errors.InvalidRequestException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserDbService {
    private final UserRepo userRepo;

    public User fetchAllByMobile(String mobile){
        return userRepo.findAllByMobile(mobile);
    }

    @Transactional
    public void createUser(UserDTO userDTO){
        User user = new User();
        user.setMobile(userDTO.getMobile());
        user.setName(userDTO.getName());
        userRepo.save(user);
    }

}
