package cn.dubhe.webstudy04.service.impl;

import cn.dubhe.webstudy04.dao.UserDao;
import cn.dubhe.webstudy04.dao.impl.UserDaoImpl;
import cn.dubhe.webstudy04.pojo.User;
import cn.dubhe.webstudy04.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {

        if (userDao.queryUserByUsername(username) == null) {
           // 等于null,说明没查到，没查到表示可用
           return false;
        }

        return true;

    }
}
