package day2;

import java.util.Scanner;

public class controlFlow {
    public controlFlow() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter your age");
        int var2 = var1.nextInt();
        if (var2 > 18) {
            System.out.println("you are eligable for opening bank acccount ");
        } else {
            System.out.println("you are not eligeble");
        }

        System.out.println("enter your marks");
        int var3 = var1.nextInt();
        if (var3 >= 90) {
            System.out.println("grade A");
        } else if (var3 >= 80) {
            System.out.println("grade B");
        } else if (var3 >= 70) {
            System.out.println("grade C");
        } else if (var3 >= 60) {
            System.out.println("grade D");
        } else {
            System.out.println("fail");
        }

        System.out.println("enter your day number");
        int var4 = var1.nextInt();
        switch (var4) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid day number");
        }

    }
}