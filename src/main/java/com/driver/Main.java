package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    static class Product {
        // Task 3: Method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Calling overloaded methods
        System.out.println("Product of 2 and 3: " + p.product(2, 3));
        System.out.println("Product of 2, 3 and 4: " + p.product(2, 3, 4));
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));
    }
}
