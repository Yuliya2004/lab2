package rtu.mirea.gibo01.pr2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
            System.out.println ("Привет, как тебя зовут?");
            Scanner sm = new Scanner (System.in);
            String m = sm.nextLine ();
            System.out.println ("Очень приятно познакомиться, " + m + ", я компьютер. ");
            int a, b, c;
            final int N = 5;
            System.out.print ("Введите a: ");
            a = sm.nextInt ();
            System.out.print ("Введите b: ");
            b = sm.nextInt ();
            c = a + b;
            System.out.println ("Сумма a + b = " + c);
        }
}
