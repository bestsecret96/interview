package com.interview.string;

public class ReverseStringAllWays {

    public static void main(String[] args) {
        String str = "hello";

        System.out.println("=== Basic Java (manual loop) ===");
        System.out.println("Reversed: " + reverseBasic(str));

        System.out.println("\n=== Java 8 Style (StringBuilder) ===");
        System.out.println("Reversed: " + reverseJava8(str));

        System.out.println("\n=== Java 17 Style (var + StringBuilder) ===");
        System.out.println("Reversed: " + reverseJava17(str));

        System.out.println("\n=== Recursive Reversal ===");
        System.out.println("Reversed: " + reverseRecursive(str));
    }

    // 1. Basic Java (manual reversal with loop)
    static String reverseBasic(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // 2. Java 8 style using StringBuilder
    static String reverseJava8(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // 3. Java 17 style using var
    static String reverseJava17(String str) {
        var builder = new StringBuilder(str);
        var reversed = builder.reverse().toString();
        return reversed;
    }

    // 4. Recursive method
    static String reverseRecursive(String str) {
        if (str.isEmpty()) return str;
        System.out.println("Current string: " + str.substring(1));
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }
}
