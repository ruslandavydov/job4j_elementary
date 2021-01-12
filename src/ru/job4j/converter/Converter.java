package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int inDollar = 120;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expected == outEuro;
        boolean passedDollar = expected == outDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("120 rubles are 2 dollars. Test result : " + passedDollar);
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");
    }
}
