//Day 3 - Introduction to Conditional Statements

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
<<<<<<< HEAD

    if(N%2==0) {
=======
        
    if(N%2==0){
>>>>>>> b0acc5ce78799e99c9d59fa6ae1a8de0d027ba3f
        if(N>=2 && N<=5)
            System.out.print("Not Weird");
        else if(N>=6 && N<=20)
            System.out.print("Weird");
            else
            System.out.print("Not Weird");
    } else {
        System.out.print("Weird");
    }
        scanner.close();
    }
}