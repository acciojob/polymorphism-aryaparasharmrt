package com.driver;

//Polymorphism Example
public class Main {


    public static class Product{

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    
    public static void main(String[] args) {
        //Create object of a Class
        Product p = new Product();
        p.product(3, 4);
        p.product(3, 4, 5);
        p.product(3.4, 7.1);
    }
}

