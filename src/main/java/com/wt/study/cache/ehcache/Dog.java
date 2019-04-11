package com.wt.study.cache.ehcache;

/**
 * @ProjectName: workspace
 * @Package: com.wt.study.cache.ehcache
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019/1/31 5:51 PM
 * @Version: v1.0
 */
public class Dog {
    private long id;
    private String name;
    private short age;

    public Dog(long id, String name, short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
