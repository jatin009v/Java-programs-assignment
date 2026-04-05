// Question 31: Create a user-defined package 'com.math' with a 'Calculator' class.
package com.math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public void msg() {
        System.out.println("Hello from com.math.Calculator package!");
    }
}

// Main file to test the user-defined package
import com.math.Calculator;

public class TestPackage {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.msg();
        System.out.println("Sum: " + obj.add(10, 20));
    }
}
