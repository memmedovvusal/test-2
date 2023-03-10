package lesson4men;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
`
public class OperatorsApp {
    public static void mainv1(String[] args) {

        int a = 20;
        int b = 25;

        System.out.println(a == b);
        System.out.println(a = b);
        a = b;

        System.out.println(b != 25);
        System.out.println(a != 20);

        boolean c = b == a;
        System.out.println(a);

    }

    public static void mainv(String[] args) {
        //imput

        int num = 6;
        //process

        boolean isOdd = num % 2 == 1;

        //output

        System.out.println(isOdd ? "TEK" : "CUT");
    }

    public static void mainx(String[] args) {
        //imput
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();

        //process

        boolean isOdd = num % 4 == 1;

        //output

        System.out.println(isOdd ? "TEK" : "CUT");


    }

    public static void mains(String[] args) {

        //imput
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        System.out.printf("%.5f", num);


    }

    public static void mainj(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word);
        System.out.println(word);
        System.out.println(word);

    }

    public static void mainn(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.length());
        System.out.println(word);
        System.out.println(word);

    }




    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.lineSeparator());
        System.out.println();
    }

}
