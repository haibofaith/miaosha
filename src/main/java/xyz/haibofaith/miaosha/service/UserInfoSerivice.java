package xyz.haibofaith.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
