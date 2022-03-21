package com.luoxiaojiang.service.impl;

import com.luoxiaojiang.dao.impl.UserDaoImpl;
import com.luoxiaojiang.pojo.User;
import com.luoxiaojiang.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    UserDaoImpl tool=new UserDaoImpl();
    public boolean addUser(User user) {
        if(tool.addUser(user)){
            return true;
        }else{
            return false;
        }
    }

    public boolean delUser(String id) {
        return false;
    }

    public boolean updateUser(String id,String name,String style) {
        if(tool.updateUser(id,name,style)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean certification(String id, String realname, String school, String telephone) {
        if(tool.certification(id,realname,school,telephone)){
            return true;
        }else{
            return false;
        }
    }

    public List<Map<String, Object>> selectUserById(String id) {
        List<Map<String,Object>> now=tool.selectUserById(id);
        if(now!=null){
            return now;
        }else{
            return null;
        }
    }

    public List<User> selectAllUser() {
        return null;
    }
}
