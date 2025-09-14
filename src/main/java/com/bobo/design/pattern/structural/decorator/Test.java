package com.bobo.design.pattern.structural.decorator;

public class Test {

    public static void main(String[] args) {



        AbstractNoodles noodles;
        noodles = new Noodles();
        noodles = new EggDecorator(noodles);
        noodles = new BeefDecorator(noodles);
        System.out.println("一份" + noodles.getDescription() + "的 noodles 价格是：" + noodles.getPrice());

    }
}
