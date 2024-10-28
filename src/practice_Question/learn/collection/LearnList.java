package practice_Question.learn.collection;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Mango");
        l.add("Apple");
        l.add("Mango");
        l.add("Apple");

        System.out.println("Origina ArrayList : "+l);

        Set<String> s = new LinkedHashSet<String>(l);
        System.out.println("Remove duplicate using set : "+s);


        Deque<Integer> deq = new ArrayDeque<>();

        deq.push(12);
        deq.push(14);
        deq.push(77);
        System.out.println(deq);


    }
}
