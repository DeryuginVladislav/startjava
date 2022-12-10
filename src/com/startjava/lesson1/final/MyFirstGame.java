package com.startjava.lesson1.final;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 1 + (int) (Math.random() * 100);
        int playerNum = 10;
        int maxNum = 100;
        int minNum = 1;
        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                maxNum = --playerNum;
                playerNum = (maxNum + minNum) / 2;
                continue;
            }
            if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                minNum = ++playerNum;
                playerNum = (maxNum + minNum) / 2;
            }
        }
        System.out.println("Вы победили! Это число - " + playerNum);
    }
}