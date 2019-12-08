package com.smc.user.controller;


import com.smc.user.model.UsersDTO;
import com.smc.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/usernav", method = RequestMethod.POST)
    public void updatepassword(@RequestParam UsersDTO usersDTO) {
    
   usersService.findUser(usersDTO);
   Integer userid = usersDTO.getId();
//   usersDTO.setPassword(newpassword);//接来页面上新的password
   String newpassword = usersDTO.getPassword();
   if("1".equals(usersDTO.getConfirmed())) {

	   usersService.changePassword(userid, newpassword);

   }else {

	   System.out.println("Your account is not confirmed.");

   }
   

          }

}