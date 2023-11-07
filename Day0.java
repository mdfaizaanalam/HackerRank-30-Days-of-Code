//Day 0 - Hello, World

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) 
    {
        /* Create a Scanner object to read input from stdin.*/
        Scanner scan = new Scanner(System.in);
        /* Read a full line of input from stdin and save it to our variable, inputString.*/
        String inputString = scan.nextLine();
        /* Close the scanner object because we've finished reading all of the input from stdin needed for this challenge.*/
        scan.close();

        /* Print a string literal saying "Hello, World." to stdout.*/
        System.out.println("Hello, World.");
        /* Print the contents of inputString to stdout.*/
        
        /* Solution starts from here */
        System.out.println(inputString);
        /* Solution ends here */
    }
}
