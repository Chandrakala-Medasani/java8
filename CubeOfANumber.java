package java8.function;


import java.util.Scanner;
import java.util.function.Function;

//Write a program to find the cube of a number using Function<Integer, Integer>
public class CubeOfANumber {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        Function<Integer, Integer> f = (n1) -> n1*n1*n1;
        System.out.println(f.apply(n));

    }
}
