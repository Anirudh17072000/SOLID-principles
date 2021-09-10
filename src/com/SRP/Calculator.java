package com.SRP;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Addition addition= new Addition();
        Subtraction subtract=new Subtraction();
        Multiplication multiplication=new Multiplication();
        Division division= new Division();
        char choice;
        int a, b;
        Scanner sc= new Scanner(System.in);
        while(true)
        {

            System.out.println("Please press");
            System.out.println("Press '+' : For Addition");
            System.out.println("Press '-' : For Subtraction");
            System.out.println("Press '*' : For Multiplication");
            System.out.println("Press '/' : For Division");
            System.out.println(" '!' : To exit the Calculator");
            System.out.println("Enter the choice");
            choice = (sc.next()).charAt(0);
            if(choice == '!') {

                System.out.println("Calculator close");
                return;
            }
            System.out.println("Enter your first number:");
            a = sc.nextInt();
            System.out.println("Now enter your second number:");
            b = sc.nextInt();

            switch (choice) {
                case '+':
                    System.out.println("The result of Addition is: " + addition.add(a,b) + "\n\n");
                    break;
                case '-':
                    System.out.println("The result of Subtraction is: " + subtract.subtract(a,b) + "\n\n");
                    break;
                case '*':
                    System.out.println("The result of Multiplication is: " + multiplication.multiply(a, b) + "\n\n");
                    break;
                case '/':
                    System.out.println("The result of Division is: " + division.divide(+(double) a, (double) b)+"\n\n");
                    break;
                default:
                    System.out.println("Incorrect Choice! Re-enter again\n\n");
            }
        }
    }
}
