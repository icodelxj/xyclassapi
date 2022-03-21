package com.luoxiaojiang.service;

import com.luoxiaojiang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //增加一个用户(value)
    public boolean addUser(User user);
    //删除一个用户(id)
    public boolean delUser(String id);
    //修改一个用户(id,value)
    public boolean updateUser(String id,String name,String style);
    //学生认证
    public boolean certification(String id,String realname,String school,String telephone);
    //查询一个用户(id)
    public List<Map<String, Object>> selectUserById(String id);
    //查询全部用户
    public List<User> selectAllUser();
}
