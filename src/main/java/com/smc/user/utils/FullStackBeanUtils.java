package com.smc.user.utils;

import ch.qos.logback.classic.pattern.DateConverter;
import com.smc.user.entity.Users;
import com.smc.user.model.UsersDTO;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Enumeration;

public class FullStackBeanUtils {

    public static <T> T request2Bean(HttpServletRequest request, Class<T> bean) {
        T t = null;
        try {
            t = bean.newInstance();
            Enumeration parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                String name = (String) parameterNames.nextElement();
                String value = request.getParameter(name);

                BeanUtils.setProperty(t, name, value);
            }
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        return t;

    }
    
    /**
    *
    * @param users
    * @return
    */
   public static UsersDTO cloneUsers(Users users) {
       if(users == null) {
           return null;
       }
       UsersDTO usersDTO = new UsersDTO();
       usersDTO.setId(users.getUserid());
       usersDTO.setUsername(users.getUsername());
       usersDTO.setPassword(users.getPassword());
       usersDTO.setUsertype(users.getUsertype());
       usersDTO.setEmail(users.getEmail());
       usersDTO.setMobile(users.getMobile());
       return usersDTO;
   }

   public static Users cloneUsersDTO(UsersDTO usersDTO) {
       if (usersDTO == null) {
           return null;
       }
       Users users = new Users();
       users.setUserid(usersDTO.getId());
       users.setUsername(usersDTO.getUsername());
       users.setPassword(usersDTO.getPassword());
       users.setUsertype(usersDTO.getUsertype());
       users.setEmail(usersDTO.getEmail());
       users.setMobile(usersDTO.getMobile());
       return users;
   }
}
