package com.login.serviceimpl;

import com.login.binding.LoginUser;
import com.login.model.UserEntity;
import com.login.repo.UserRepo;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public String userRegister(UserEntity userEntity) {
        UserEntity register = userRepo.save(userEntity);

        if(register == null){
            return "Register failed";
        }else {
            return "Register success";
        }
    }

    @Override
    public String loginUserWithEmail(LoginUser loginUser) {

        UserEntity userEntity = userRepo.findByEmailAndPassword(loginUser.getEmailId(), loginUser.getPassword());

        if(userEntity == null){
            return "login failed";
        }else {
            return "login success";
        }
    }

}
