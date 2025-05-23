package com.bobo.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式",
                "Java设计模式PPT",
                "Java设计模式Video",
                "Java设计模式Article",
                "Java设计模式QA"
        );
        System.out.println(course);
    }
}
