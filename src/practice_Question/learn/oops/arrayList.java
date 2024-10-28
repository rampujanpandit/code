package practice_Question.learn.oops;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Ram", 1, 97.7));
        s.add(new Student("Rai", 2, 98.6));
        s.add(new Student("Jai", 3, 95.4));

        for(Student n :s){
            System.out.println(n);
        }
    }
}
