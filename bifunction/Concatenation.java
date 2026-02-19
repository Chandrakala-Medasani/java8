package java8.bifunction;

//Write a program to concatenate two strings with a dash (-) between them using BiFunction<String, String, String>

import java.util.Scanner;
import java.util.function.BiFunction;

public class Concatenation {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String b = scr.nextLine();

        BiFunction<String,String,String> bf = (s1,s2) -> s1+"-"+s2;

        System.out.println(bf.apply(a,b));
    }
}
