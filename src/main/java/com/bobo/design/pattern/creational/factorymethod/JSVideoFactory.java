package com.bobo.design.pattern.creational.factorymethod;

public class JSVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JSVideo();
    }
}
