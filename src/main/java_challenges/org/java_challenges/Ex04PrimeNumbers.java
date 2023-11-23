package org.java_challenges;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Ex04PrimeNumbers {
    public List<Integer> calcPrimesUpTo(int x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <=x; i++) {
            if (isPrimeNumbers(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isPrimeNumbers(int x) {
        if (x <=1) {
            return false;
        } else if (x==2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(x) + 1; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ex04PrimeNumbers ex04PrimeNumbers = new Ex04PrimeNumbers();
        System.out.println(ex04PrimeNumbers.calcPrimesUpTo(100));
    }
}