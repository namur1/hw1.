package com.company;

public class Main {

    public static void main(String[] args) {
        String adidas_Top;
        final int num = 4;
        String word = "adidas";
        adidas_Top = "adidas 5";
        System.out.println(num + " " + word + " " + adidas_Top);
        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль‘");
        }

    }
}
