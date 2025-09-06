package com.bobo.design.pattern.creational.prototype;

import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("原型模式测试");
        Date birthday = new Date();
        GirlFriend gf1 = new GirlFriend("小花", 18, 170, 50, birthday);
        System.out.println(gf1);
        GirlFriend gf2 = (GirlFriend) gf1.clone();
        gf2.setName("小美");
        gf2.setBirthday(new Date(6666666666666666L));
        System.out.println(gf2);
        System.out.println(gf1);
    }
}
