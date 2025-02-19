package com.driver;

public class Main {

    // Task 1: Create a public class Product inside Main
    public static class Product {

        // Task 3: Create a method with two int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product class
        Product p = new Product();

        // Calling overloaded methods
        System.out.println(p.product(5, 4)); // Calls product(int, int)
        System.out.println(p.product(2, 3, 4)); // Calls product(int, int, int)
        System.out.println(p.product(2.5, 3.5)); // Calls product(double, double)
    }
}
