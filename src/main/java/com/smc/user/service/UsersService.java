package com.smc.user.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smc.user.utils.CommonResult;
import com.smc.user.entity.Users;
import com.smc.user.model.UsersDTO;
import com.smc.user.repository.UsersRepository;
import com.smc.user.utils.FullStackBeanUtils;

@Service
public class UsersService {


	@Autowired
    private UsersRepository usersRepository;

    /**
     * Used by function UserLogin
     * @param email & password
     * @return
     */
    public CommonResult findUser(UsersDTO usersDTO) {
    	
    	String email = usersDTO.getEmail();
    	String password = usersDTO.getPassword();
//    	Users users = usersRepository.findByEmailAndPassword(usersDTO.getEmail(), usersDTO.getPassword());
    	Users users = usersRepository.findByEmailAndPassword(email, password);
//        return FullStackBeanUtils.cloneUsers(user);
         
    	return CommonResult.build(200, "Login success!", users);
    }


    /**
     * Used by function UserLogin
     * @param id
     * @return
     */
//    public CommonResult findUsers(int id) {
//        Users users = usersRepository.findUsersById(id);
//        usersRepository.updatePasswordById(id);
//        UsersDTO usersDTO = new UsersDTO();
//        usersDTO = FullStackBeanUtils.cloneUsers(users);
//        return CommonResult.build(200, "Login success!", usersDTO);
//    };

}
