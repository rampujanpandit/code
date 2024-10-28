package practice_Question.prepInsta.gettingStarted;

import java.util.Scanner;


public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("Positive number");
        }else{
            System.out.println("Negative Number");
        }
    }
}
