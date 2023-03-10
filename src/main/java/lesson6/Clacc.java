package lesson6;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Clacc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.trim());
        System.out.println(word);

    }
}
