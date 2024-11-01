package yatzagazig;
import java.util.Scanner;
public class LectureThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number : ");
        double n1 = scanner.nextDouble();
        System.out.print("enter an operator : ");
        char operator = scanner.next().charAt(0);
        System.out.print("enter second number : ");
        double n2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                System.out.println("result of n1 + n2 : " + (n1 + n2));
                break;
            case '-':
                System.out.println("result of n1 - n2 : " + (n1 - n2));
                break;
            case '*':
                System.out.println("result of n1 * n2 : " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0)
                System.out.println("result of n1 / n2 : " + (n1 / n2));
                else
                { System.out.println("invalid");}
                break;
            default:
                System.out.println(" invalid operator");
        }

    }
}
