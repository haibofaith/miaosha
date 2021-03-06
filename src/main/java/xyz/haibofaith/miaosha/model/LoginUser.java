package xyz.haibofaith.miaosha.model;

import org.hibernate.validator.constraints.Length;
import xyz.haibofaith.miaosha.validator.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * @author:haibo.xiong
 * @date:2019/5/14
 * @description:
 */
public class LoginUser {
    private Integer id;
    @NotNull
    @IsMobile(required = true)
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
