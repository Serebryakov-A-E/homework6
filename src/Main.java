import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //task 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Homework 2 task 1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        //task 2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //task 3
        int j = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(j);
            j = j * 2;
        }
        //Homework 3 task 1
        int total = 0;
        int moneyPerMonth = 29_000;
        for (int i = 1; i <= 12; i++) {
            total += moneyPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        //task 2
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total/100;
            total += moneyPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }
}