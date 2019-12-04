package com.smc.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.smc.user.utils.CommonResult;
import com.smc.user.utils.FullStackBeanUtils;
import com.smc.user.entity.Users;
import com.smc.user.model.UsersDTO;
import com.smc.user.service.UsersService;

@SpringBootTest
class UserApplicationTests {


	@Autowired
	private UsersService usersService;

	@Test
	public void userLogin(){
		try {
			UsersDTO usersDTO = new UsersDTO(); 
			usersDTO.setEmail("wangrt@cn.ibm.com");
			usersDTO.setPassword("888888");
			CommonResult res = usersService.findUser(usersDTO);
	        Users users = new Users();
	        users = (Users) res.getData();
		  	System.out.println("1*****1******" + users.getEmail());
		    System.out.println("2*****2******" + users.getPassword());
	    	System.out.println("***********login succeed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("***********login failed");
		}
	}
	
	@Test
	public void updatePassword() {
		try {
			UsersDTO usersDTO = new UsersDTO();
			Users users = new Users();
			users.setUserid(1);
			Integer userid = users.getUserid();
			CommonResult res = usersService.findUsers(userid);
			if (res.getData()!= null) {
			usersDTO.setId(1);
			usersDTO.setPassword("123999");}
			Integer id = usersDTO.getId();
			String password = usersDTO.getPassword();
			res = usersService.changePassword(id, password);
			System.out.println("Your password has been updated successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("***********update password failed");
		}
			
	}
}
