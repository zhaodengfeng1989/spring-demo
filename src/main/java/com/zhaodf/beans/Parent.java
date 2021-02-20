package com.zhaodf.beans;

/**
 * 类：Parent
 *
 * @author zhaodf
 * @date 2021/2/18
 */
public class Parent {
    private Integer id;
    private String username;
    private String realname;

    public Parent() {
        System.out.println("Parent 被实例化");
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
