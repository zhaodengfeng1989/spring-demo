package com.zhaodf.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 类：SpELBean
 *
 * @author zhaodf
 * @date 2021/2/19
 */
public class SpELBean {
    private Integer id;
    private String name;
    private List<String> list;
    private Map<Integer,String> map;
    private Properties properties;
    private Set<String> set;
    private String[] array;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SpELBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                ", set=" + set +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
