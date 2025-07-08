package com.bobo.design.pattern.creational.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Question question = new Question();
        question.setUsername("BoboStu");
        question.setQuestion("软件设计七大原则是哪七大？");
        Teacher teacher = new Teacher("BoboTec");
        course.addObserver(teacher);
        course.proudceQuestion(course, question);
    }
}
