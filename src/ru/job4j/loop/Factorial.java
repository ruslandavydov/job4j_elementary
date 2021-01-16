package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 0;
        for (int index = 1; index <= n; index++) {
            return result * index == 0 ? 0 : result * index;
        }
        return result;
    }
}
