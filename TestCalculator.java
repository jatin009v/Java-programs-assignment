// Save this in a folder path: com/math/Calculator.java
package com.math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// Save this in the main folder: TestCalculator.java
import com.math.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum: " + obj.add(10, 20));
    }
}
