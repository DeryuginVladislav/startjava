package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setArmor(9);
        strikerEureka.setHeight(76.2f);
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setStrength(10);
        strikerEureka.setWeight(1.850f);

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha","Mark-1","Russia",
                85.34f,2.412f,10,10);
        chernoAlpha.setWeight(5.21f);
        strikerEureka.setStrength(12);
        System.out.println(strikerEureka.getStrength());
        strikerEureka.setOrigin("India");
        System.out.println(strikerEureka.getOrigin());

    }
}
