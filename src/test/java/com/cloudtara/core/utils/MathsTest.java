package com.cloudtara.core.utils;

public class MathsTest {

    public static void main(String[] args) {
        assert Maths.add(2, 3) == 5;
        assert Maths.sub(5, 1) == 4;
        assert Maths.multiply(2, 5) == 10;
        assert Maths.divide(5, 2) == 100;
    }
}
