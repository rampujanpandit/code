package practice_Question.prepInsta.gettingStarted;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
