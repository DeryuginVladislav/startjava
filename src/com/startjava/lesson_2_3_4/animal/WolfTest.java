package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Серый");
        wolf.setGender("male");
        wolf.setWeight(20);
        wolf.setAge(5);
        wolf.setColor("gray");
        System.out.println("Кличка = " + wolf.getName() + " Пол = " + wolf.getGender() + " Вес = " +
                wolf.getWeight() + " Возраст = " + wolf.getAge() + " Окрас = " + wolf.getColor());
        wolf.sit();
        wolf.run();
        wolf.move();
        wolf.howl();
        wolf.hunt();
    }
}
