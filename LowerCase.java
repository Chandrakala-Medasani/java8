package java8.function;

import java.util.Scanner;
import java.util.function.Function;

//Write a program to convert a given string to lowercase using Function

public class LowerCase {

    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        String str = scr.nextLine();

        Function<String,String> f = (st) -> st.toLowerCase();
        System.out.println(f.apply(str));
    }
}
