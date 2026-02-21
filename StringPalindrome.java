package java8.function;

//Check whether a string is a palindrome using Function<String, Boolean>

import java.util.Scanner;
import java.util.function.Function;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Function<String,Boolean> f = (st) -> {
//            StringBuilder sb = new StringBuilder(st);
//            return sb.toString().equals(sb.reverse().toString());

            String reversed = new StringBuilder(st).reverse().toString();
            return st.equals(reversed);
        };

        System.out.println(f.apply(str));
    }
}

