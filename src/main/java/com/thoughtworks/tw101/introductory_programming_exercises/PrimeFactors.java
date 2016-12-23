package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        while (n%2 ==0){
         System.out.println(2);
         n = n/2;
        }
        for (int i = 3; i <= n; i = i+2)
        {
            while (n%i == 0)
            {
                System.out.println(i);
                n = n/i;
            }
        }

        return null;
    }
}
