package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if (number <= 1) {
            prime = false;
        } else {
            for (int index = 2; index < number; index++) {
                if (number % 2 == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}