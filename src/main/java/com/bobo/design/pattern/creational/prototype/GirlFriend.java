package com.bobo.design.pattern.creational.prototype;

import java.util.Date;

public class GirlFriend implements Cloneable{
    private String name;
    private int age;
    private int height;
    private int weight;
    private Date birthday;

    public GirlFriend(String name, int age, int height, int weight, Date birthday) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GirlFriend girlFriend = (GirlFriend) super.clone();
        girlFriend.birthday = (Date) girlFriend.birthday.clone();
        return girlFriend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
