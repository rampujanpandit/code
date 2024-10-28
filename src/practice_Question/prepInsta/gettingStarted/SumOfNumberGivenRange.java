package practice_Question.prepInsta.gettingStarted;

import java.util.Scanner;

public class SumOfNumberGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first range ");
        int n1 = sc.nextInt();
        System.out.println("Enter second range");
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i=n1;i<=n2;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
