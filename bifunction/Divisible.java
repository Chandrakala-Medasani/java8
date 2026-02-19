package java8.bifunction;

//Write a program that takes two numbers and returns true if the first number is divisible by the second using BiFunction<Integer, Integer, Boolean>

import java.util.Scanner;
import java.util.function.BiFunction;

public class Divisible {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        BiFunction<Integer,Integer,Boolean> bf = (n1,n2) -> (n1%n2==0)?true:false ; // I can directly write n1%n2==0

        System.out.println(bf.apply(a,b));
    }


}
