package com.luoxiaojiang.dao.impl;

import com.luoxiaojiang.dao.UserDao;
import com.luoxiaojiang.pojo.User;
import com.luoxiaojiang.util.jdbc.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    public boolean addUser(User user) {
        String sql="insert into user values(?,?,?,?,?,?,?,?,?,?,?)";	//定义sql语句
        try{
            int res=template.update(sql,user.getUid(),user.getName(),user.getImage(),user.getSex(),user.getSchool(),user.getTelephone(),user.getRealName(),user.getStyle(),user.getAdd_time(),user.getType(),user.getMoney());
            if (res>=1){
                return true;
            }
            else
            {
                System.out.println(sql);
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }

    public boolean delUser(String id) {
        return true;
    }

    public boolean updateUser(String id,String name,String style) {
        String sql="update user set Name=?,Style=? where Uid=?";	//定义sql语句
        try{
            int res=template.update(sql,name,style,id);
            if (res>=1){
                System.out.println(res);
                return true;
            }
            else
            {
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean certification(String id, String real_name, String school, String telephone) {
        String sql="update user set Real_name=?,School=?,Telephone=?,Type=? where Uid=?";	//定义sql语句
        try{
            int res=template.update(sql,real_name,school,telephone,"学生",id);
            if (res>=1){
                System.out.println(res);
                return true;
            }
            else
            {
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }

    public List<Map<String, Object>> selectUserById(String id) {
        String sql="select * from user where Uid=?";	//定义sql语句
        try{
            List<Map<String, Object>> list =template.queryForList(sql,id);
            User a=new User();
            if (list.size()>=1){
                return list;
            }
            else
            {
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }

    public List<User> selectAllUser() {
        return null;
    }
}
