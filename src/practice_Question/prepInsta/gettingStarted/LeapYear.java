package practice_Question.prepInsta.gettingStarted;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if(year%400 == 0 || (year % 4 == 0 && year %100 !=0)){
            System.out.println("leap year "+year);
        }else{
            System.out.println("not leap year "+year);
        }
    }
}
