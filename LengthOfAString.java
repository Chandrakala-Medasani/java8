package java8.function;

import java.util.Scanner;
import java.util.function.Function;

//Write a program to calculate the length of a string using Function<String, Integer>

public class LengthOfAString {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Function<String,Integer> f = (st) -> st.length();
        System.out.println(f.apply(str));
    }
}
