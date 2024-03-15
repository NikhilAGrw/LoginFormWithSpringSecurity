package com.login.security;

import com.login.model.UserEntity;
import com.login.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       UserEntity user = new UserEntity();


        UserEntity userEntity = userRepo.findByEmailAndPassword(username, user.getPassword());

        if(userEntity == null){
            throw  new UsernameNotFoundException("User not Found Exception");
        }
        return new GetUserDetails(userEntity);
    }
}
