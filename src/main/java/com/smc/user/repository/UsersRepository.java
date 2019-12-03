package com.smc.user.repository;

import com.smc.user.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users,Integer> {
//    public Optional<Users> findById(Integer id);

    public Users findByEmailAndPassword(String email, String password);


//    @Query(value = "select * from users u where u.userid = ?1 ", nativeQuery = true)
//    public Users findUsersById(int userid);
//
//    @Query(value = "select * from Users u where u.user_name like %?1% " , nativeQuery = true)
//    public List<Users> findByUserNameLike(String userName);
//    
//    @Modifying
////  Users from entity Users class
//    @Query("update Users u set u.confirmed = :confirmed where u.id=:id")
////    a原生sql
////    @Query(value = "update users u set u.confirmed = ?2 where u.id=?1", nativeQuery = true)  
//    public Integer UsersByIdAndConfirmed(@Param("id") Integer id, @Param("confirmed") Integer confirmed);
//
//    
//    @Modifying
//    @Query(value = "insert into users (id,userName,password,userType,email,mobileNumber,confirmed) values (:id,:userName,:password,:userType,:email,:mobileNumber,:confirmed) ", nativeQuery = true)
//    public Users addUsersById(int id);
    
    @Modifying
    @Query("update Users u set u.password = :password where u.userid=:userid")
    public Integer updatePasswordById(@Param("userid") Integer userid);
}

