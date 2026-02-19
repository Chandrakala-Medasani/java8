package java8.bifunction;

//Write a program to multiply two integers using BiFunction<Integer, Integer, Integer>

import java.util.Scanner;
import java.util.function.BiFunction;

public class Product {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        BiFunction<Integer,Integer,Integer> bf = (n1,n2) -> n1*n2;
        System.out.println(bf.apply(a,b));
    }
}
