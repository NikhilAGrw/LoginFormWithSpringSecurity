package com.login.repo;

import com.login.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    @Query(value = "SELECT * FROM user_entity WHERE email_id = :email AND password = :password", nativeQuery = true)
    UserEntity findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}

