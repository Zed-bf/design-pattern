package com.bobo.design.pattern.creational.observer;

import lombok.Data;

import java.util.Observable;

@Data
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void proudceQuestion(Course course, Question question) {
        System.out.println(course.getCourseName() + "上 " + question.getUsername()
                + "提出了问题：" + question.getQuestion());
        setChanged();
        notifyObservers(question);
    }

}
