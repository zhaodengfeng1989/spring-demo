package com.zhaodf.beans;

/**
 * 类：Wife
 *
 * @author zhaodf
 * @date 2021/1/23
 */
public class Husband {
    private Integer age;
    private String name;
    private Wife wife;

    public Husband() {
        System.out.println("Husband已加载");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", wife=" + wife +
                '}';
    }
}
