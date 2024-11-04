package yatzagazig;
import java.util.Scanner;
public class LectureThree {
    public static void main(String[] args) {

        // Task 1: Initialize and print an integer array
        int[] numbers1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        // Task 2: Find the sum of all elements in an array
        int[] numbers2 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers2.length; i++) {
            sum += numbers2[i];
        }
        System.out.println("Sum: " + sum);

        // Task 3: Count even numbers in an array
        int[] numbers3 = {1, 2, 3, 4, 5};
        int evenCount = 0;
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);

        // 4: Find the largest number in an array
        int[] numbers4 = {1, 2, 3, 4, 5};
        int max = numbers4[0];
        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > max) {
                max = numbers4[i];
            }
        }
        System.out.println("Largest number: " + max);

        //5: Find the smallest number in an array
        int[] numbers5 = {1, 2, 3, 4, 5};
        int min = numbers5[0];
        for (int i = 1; i < numbers5.length; i++) {
            if (numbers5[i] < min) {
                min = numbers5[i];
            }
        }
        System.out.println("Smallest number: " + min);

        // 6: Reverse the elements of an array
        int[] numbers6 = {1, 2, 3, 4, 5};
        System.out.print("Reversed: ");
        for (int i = numbers6.length - 1; i >= 0; i--) {
            System.out.print(numbers6[i] + " ");
        }
        System.out.println();

        //  7: Check if an array is empty using if-else
        int[] numbers7 = {};
        if (numbers7.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }

        //  8: Switch statement to print "Pass" or "Fail" based on grades
        int[] grades = {45, 65, 30, 75, 85};
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 50) {
                System.out.println(grade + " - Pass");
            } else {
                System.out.println(grade + " - Fail");
            }
        }

        // 9: Count elements greater than a specific number
        int[] numbers9 = {10, 20, 30, 40, 50};
        int specificNumber = 25;
        int greaterCount = 0;
        for (int number : numbers9) { //for each loop
            if (number > specificNumber) {
                greaterCount++;
            }
        }
        System.out.println("Count of numbers greater than " + specificNumber + ": " + greaterCount);

        // 10: Print numbers divisible by 3
        int[] numbers10 = {1, 3, 6, 9, 12};
        System.out.print("Divisible by 3: ");
        for (int number : numbers10) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        // 11: Count occurrences of a specific number
        int[] numbers11 = {1, 2, 3, 4, 3, 5};
        int targetNumber = 3;
        int freqCount = 0;
        for (int number : numbers11) {
            if (number == targetNumber) {
                freqCount++;
            }
        }
        System.out.println("Occurrences of " + targetNumber + ": " + freqCount);

        // 12: Print "Positive" if all elements are positive
        int[] numbers12 = {1, 2, 3, 4, 5};
        boolean allPositive = true;
        for (int number : numbers12) {
            if (number <= 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive ? "Positive" : "Not all positive");

        // 13: Categorize array values as "small", "medium", or "large"
        int[] values = {15, 60, 120, 30};
        for (int value : values) {
            if (value < 50) {
                System.out.println(value + " - small");
            } else if (value < 100) {
                System.out.println(value + " - medium");
            } else {
                System.out.println(value + " - large");
            }
        }


        // 14: Find index of a target value in an array
        int[] numbers14 = {10, 20, 30, 40};
        int targetValue = 30;
        int index = -1;
        for (int i = 0; i < numbers14.length; i++) {
            if (numbers14[i] == targetValue) {
                index = i;
                break;
            }
        }
        System.out.println(index != -1 ? "Index: " + index : "Not Found");

        // 15: Categorize each element as "Even" or "Odd" using switch
        int[] numbers15 = {10, 15, 20, 25};
        for (int number : numbers15) {
            if (number % 2 == 0) {
                System.out.println(number + " - Even");
            } else {
                System.out.println(number + " - Odd");
            }
        }

    }
}
