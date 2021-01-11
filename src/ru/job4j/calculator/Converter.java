package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        int rubleE = Converter.euroToRuble(1);
        int rubleD = Converter.dollarToRuble(1);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");
        System.out.println("1 euro is " + rubleE + " rubles.");
        System.out.println("1 dollar is " + rubleD + " rubles.");
    }
}
