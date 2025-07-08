package com.bobo.design.pattern.creational.observer;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class Teacher implements Observer {

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(this.name + "收到了 " + course.getCourseName() + "上" +
                question.getUsername() + "提出的问题：" + question.getQuestion());
    }

    private String name;

}
