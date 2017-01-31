package edu.miracosta.cs113.hw1.lab1;

/**
 * Martin Dorobczynski
 * CS 113
 * 1/30/2017
 *
 * Lab 1 - FizzBuzz
 *
 * Driver program that prints numbers from 1 to 100 and a phrase
 * depending on whether the number is a multiple or not
 */

public class Main
{
    public static void main(String[] args)
    {

        String a = "Fizz";
        String b = "Buzz";

        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println(a+b);
            }
            else if (i % 3 == 0 )
            {
                System.out.println(a);
            }
            else if (i % 5 == 0)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}