package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                String temp = array[i];
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
