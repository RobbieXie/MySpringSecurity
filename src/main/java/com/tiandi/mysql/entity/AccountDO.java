package com.tiandi.mysql.entity;

import com.tiandi.web.dto.AccountDTO;

import java.sql.Timestamp;

/**
 * Created by Justin on 2017/3/8.
 * account表 数据库对象
 */

public class AccountDO extends BaseDO {

    private String name;
    private String username;
    private String password;

    public AccountDO(AccountDTO accountDTO) {
        this.name = accountDTO.getName();
        this.username = accountDTO.getUsername();
        this.password = accountDTO.getPassword();
    }

    public AccountDO() {

    }

    public AccountDO(Integer id, Timestamp create_time, Timestamp update_time, String name, String username, String password) {
        super(id, create_time, update_time);
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "AccountDO{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
