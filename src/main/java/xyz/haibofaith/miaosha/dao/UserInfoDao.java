package xyz.haibofaith.miaosha.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.haibofaith.miaosha.model.UserInfo;

@Mapper
public interface UserInfoDao {
    @Select("select * from user_info where id = #{id}")
    public UserInfo getById(@Param("id") int id);
    @Insert("insert into user_info(id,name) values(#{id},#{name})")
    void insert(UserInfo userInfo);
}
