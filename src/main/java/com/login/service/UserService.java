package com.login.service;

import com.login.binding.LoginUser;
import com.login.model.UserEntity;

public interface UserService {

     String userRegister(UserEntity userEntity);

     String loginUserWithEmail(LoginUser loginUser);

}
