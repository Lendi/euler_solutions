/*
Sum square difference
Problem 6 

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int a0=0; a0 < t; a0++){
            int n=in.nextInt();
            long sum_of_sq=0;
            long sq_of_sum=0;
            long result=0;
            long nth_sum=0;
            
            for(int i=1; i <= n; i++){
                nth_sum=(n*(n+1))/2 ;
                sq_of_sum=nth_sum*nth_sum;
                sum_of_sq+=(i*i);
            }
            result=Math.abs(sum_of_sq - sq_of_sum);
            System.out.println(result);
            
        }
        
        
        
    }
}