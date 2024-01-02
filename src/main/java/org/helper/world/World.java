package org.helper.world;


import java.util.Arrays;

//  https://habr.com/ru/articles/129494/
public class World {

    private static World instance;
    private int[] intArray;

    private World() {
        intArray = new int[10];
        Arrays.fill(intArray, 0);
    }

    public static synchronized World getInstance() {
        if (instance == null) {
            instance = new World();
        }

        return instance;
    }

    public int[] getIntArray() {
        return intArray;
    }
}
