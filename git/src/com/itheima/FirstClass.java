package com.itheima;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello git project");

        System.out.println(new FirstClass().add());
    }

    public int add() {
        int a = 4;
        int b = a++;
        return  a + b;
    }
}
