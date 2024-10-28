package practice_Question.prepInsta.gettingStarted;

import java.util.Scanner;

public class GreaterOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first nuber");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        if(n1>=n2){
            System.out.println("first number is greater "+n1);
        }else{
            System.out.println("second number is greater "+n2);
        }
    }
}
