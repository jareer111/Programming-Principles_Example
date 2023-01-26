package com.jareer.principle.dry;

public class WithDRY {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int average(int a, int b) {
        return sum(a, b) / 2;
    }

    public static void main(String[] args) {
        System.out.println("With DRY ");
        System.out.println("sum =" + sum(12, 2));
        System.out.println("average =" + average(12, 2));
    }
}
