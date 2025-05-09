package com.bobo.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式")
                .buildCourseVideo("Java设计模式视频").build();
        System.out.println(course);
    }
}
