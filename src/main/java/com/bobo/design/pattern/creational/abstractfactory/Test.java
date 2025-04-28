package com.bobo.design.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        video.produce();
        Article article = courseFactory.getArticle();
        article.produce();
    }
}
