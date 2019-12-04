package com.smc.user.repository;

import com.smc.user.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;



public interface UsersRepository extends JpaRepository<Users,Integer> {


    public Users findByEmailAndPassword(String email, String password);


    @Query(value = "select * from users u where u.userid = ?1 ", nativeQuery = true)
    public Users findUsersById(int userid);

    
    @Modifying
    @Transactional
    @Query(value = "update users u set u.password=?2 where u.userid=?1", nativeQuery = true)
    public Integer updatePasswordById(@Param("userid") Integer userid, @Param("password") String password);
}

