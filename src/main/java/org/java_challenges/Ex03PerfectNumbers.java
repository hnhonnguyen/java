package org.java_challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03PerfectNumbers {
    static List<Integer> calcPerfectNumbers(int x) {
        List<Integer> result = new ArrayList<>();
        for (int i =2; i < x; i++) {
            if (isPerfectNumberSimple(i)) {
                result.add(i);
            }
        }
        return result;
    }

    static boolean isPerfectNumberSimple(final int number) {
        int sum = 1;
        int i = 2;
        while (i*i <= number) {
            if (number%i ==0) {
                sum = sum + i + number/i;
            }
            i++;
        }
        return sum == number & sum != 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max number: ");
        int max_num = scanner.nextInt();

        System.out.printf("Your result: %s\n", calcPerfectNumbers(max_num));
    }
}
