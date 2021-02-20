package com.zhaodf.beans;

/**
 * 类：User
 *
 * @author zhaodf
 * @date 2021/1/21
 */
public class Child extends User{
    private Integer id;
    private String username;
    private String realname;

    public Child(Integer idxx, String username, String realname) {
        System.out.println("调用Child有参构造函数");
        this.id = idxx;
        this.username = username;
        this.realname = realname;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getRealname() {
        return realname;
    }

    @Override
    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
