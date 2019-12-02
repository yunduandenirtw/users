package com.smc.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.smc.user.utils.CommonResult;
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
	
//	@Test
//	public void updatePassword() {
//		try {
//			
//			CommonResult res = usersService.findUsers(1);
//			UsersDTO usersDTO = new UsersDTO();
//			Integer id = usersDTO.getId();
//			if (id == 1) {
//				usersDTO.setPassword("111999");}
//			Users users = new Users();
//		    users = (Users) res.getData();
//			System.out.println("Your new password is " + users.getPassword());
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("***********update password failed");
//		}
//			
//	}
}
