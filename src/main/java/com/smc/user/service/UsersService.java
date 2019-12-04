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
    	Users users = usersRepository.findByEmailAndPassword(email, password);       
    	return CommonResult.build(200, "Login success!", users);
    }


    /**
     * Used by function UserLogin
     * @param id
     * @return
     */
    public CommonResult findUsers(int userid) {
        Users users = usersRepository.findUsersById(userid);
        return CommonResult.build(200, "User exist.", users);
    };
    
    public CommonResult changePassword(int userid, String password) {
        usersRepository.updatePasswordById(userid, password);
        return CommonResult.build(200, "Password update success!");
    };

}
