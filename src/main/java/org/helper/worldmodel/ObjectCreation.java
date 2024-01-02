package org.helper.worldmodel;

public class ObjectCreation {
    public static int[] createIntArray(int length) {
        if (length < 0 || length > 10) {
            throw new IllegalArgumentException("Array length shall be between 0 and 10");
        }
        return new int[length];
    }
}
