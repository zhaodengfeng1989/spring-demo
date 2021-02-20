package com.zhaodf.beans;

/**
 * 类：User
 *
 * @author zhaodf
 * @date 2021/1/21
 */
public class UserFactoryBean{
    public User creatUserFactoryMethod(){
        return new Child(11,"zhaodf","zhaodf");
    }
}
