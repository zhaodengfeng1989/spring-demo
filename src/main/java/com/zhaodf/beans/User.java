package com.zhaodf.beans;

/**
 * 类：User
 *
 * @author zhaodf
 * @date 2021/1/21
 */
public class User{
    private Integer id;
    private String username;
    private String realname;

    public User(){
        System.out.println("调用User无参构造函数已加载");
    }

    public User(Integer idxx, String username, String realname) {
        System.out.println("调用User有参构造函数");
        this.id = idxx;
        this.username = username;
        this.realname = realname;
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
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
