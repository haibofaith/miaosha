package xyz.haibofaith.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.haibofaith.miaosha.dao.UserInfoDao;
import xyz.haibofaith.miaosha.model.UserInfo;

/**
 * @author:haibo.xiong
 * @date:2019/5/5
 * @description:
 */
@Service
public class UserInfoSerivice {
    @Autowired
    UserInfoDao userInfoDao;
    public UserInfo getById(int id){
        return userInfoDao.getById(id);
    }
    @Transactional
    public boolean tx() {
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setId(2);
        userInfo1.setName("hehe");
        userInfoDao.insert(userInfo1);
        UserInfo userInfo2 = new UserInfo();
        userInfo2.setId(1);
        userInfo2.setName("shiwu");
        userInfoDao.insert(userInfo2);
        return true;
    }
}
