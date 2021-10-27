package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите число n = ");
        int n = readVar();

        System.out.print("Введите число k = ");
        int k = readVar();

        System.out.println("Пример с введенными данными будет равен = " + calcSol(n, k));
    }

    private static int readVar() {
        Scanner sc = new Scanner(System.in);

        int k;
        return  k = sc.nextInt();
    }

    private static double calcSol(double n, int k) {
        double a = 0;

        for (int i = 1; i <= n; i++) {
            a += Math.pow(i, k);
        }

        return a;
    }
}
