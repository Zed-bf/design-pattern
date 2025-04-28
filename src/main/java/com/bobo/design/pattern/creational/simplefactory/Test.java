package com.bobo.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();

        //反射
        Video video2 = videoFactory.getVideo(PythonVideo.class);
        video2.produce();
    }
}
