import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// 1. area of rectangle
        int width = 7;
        int height = 5;
        int area = width * height;
        System.out.println("The area of the rectangle = " + area);


//        2. What will be the output of the following code?
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(++x);
        int x = 5;
        System.out.println(x++);// post increment // print 5 first then increment
        System.out.println(++x);// pre increment  // x is now = 6 --> increment first then print 7


// 3.Given int a = 17 and int b = 4, use the modulus operator to find the remainder of a divided by b.
        int a = 17;
        int b = 4;
        int remainder = a % b;
        System.out.println("The remainder of " + a + " divided by " + b + " is: " + remainder);


//4. Use the ternary operator to check if a number is positive or negative. Set int num = -10.
        int num = -10;
        String status = (num < 0) ? "Negative" : "Positive";
        System.out.println(status);
//5. Write a program to check if two numbers, int a = 5 and int b = 8, are equal using the == operator.
        int A = 5;
        int B = 8;
        if (A == B) {
            System.out.println("the numbers are equal ");
        } else {
            System.out.println("the numbers are not equal ");
        }
//6. Write a program that checks if int age = 25 is between 18 and 30 using logical AND (&&).
        int age = 25;

        if (age >= 18 && age <= 30) {
            System.out.println("age is between 18 and 30");
        } else {
            System.out.println("age is not between 18 and 30");
        }
//7. Given int score = 95, check if score is either above 90 or below 50 using logical OR (||).
        int score = 95;
        if (score >= 90 || score <= 50) {
            System.out.println("the score is between 90 and 50");
        } else {
            System.out.println("the score is not between 90 and 50");
        }
//8. Reverse a boolean value using the logical NOT (!) operator. Given boolean isAvailable = true, print the opposite.
        boolean isAvailable = true;
        System.out.println("the opposite status : " + !isAvailable);

//9. Divide int x = 50 by int y = 3 and print the quotient and remainder.
        int num1=50;
        int num2=3;
        int quotient = num1/num2;
        int remain = num1%num2;
        System.out.println("quotient = "+ num1+" / "+num2 +" = " + quotient );
        System.out.println("remainder = " +num1+" % " +num2+" = " + remain);
//10. Calculate the expression 5 + 3 * 2 and then override the precedence using parentheses (5 + 3) * 2.
        int calculation1= 5+3*2;
        int claculation2= (5 + 3) * 2;
        System.out.println("calc1 = " + calculation1);
        System.out.println("clac2 = " + claculation2);
//11. Use the subtraction assignment operator to decrement a variable by a certain value. Set int num = 10 and subtract 3 from it.
        int num3 = 10;
        num3 -= 3;
        System.out.println("new value of num is: " + num3);
//12.Write a program to compare int a = 20 and int b = 15 and print if a is greater than, equal to, or less than b.
        int m= 20;
        int n=15;
        if (m==n)
        {
            System.out.println("m and n are equal");
        }
        else if (m > n)
        {
            System.out.println("m is greater than n");
        }
        else if (m < n)
        {
            System.out.println("m is less than n");
        }
//13.  Given int x = 10, use x += 5 and x *= 2 and print the result after each operation.

        int X = 10;
        X+= 5;
        System.out.println("X+= 5 : " + X);
        X*= 2;
        System.out.println("X*= 2 : " + X);

//14. Write a program that checks if int score = 85 is a passing score (greater than or equal to 60) using a ternary operator.
        int score1 = 85;

        String result = (score1 >= 60) ? "Passing score" : "Failing score";
        System.out.println("the result is : "+result);




    }
}
