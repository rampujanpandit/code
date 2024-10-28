package practice_Question.learn.string;

public class Compare {
    public static void main(String[] args) {

        // List<Integer> fb = Stream.iterate(new int[] { 0, 1 }, arr -> new int[] { arr[1], arr[0] + arr[1] })
                
        //         .limit(10)
        //         .peek(arr -> System.out.println(Arrays.toString(arr)))
        //         .map(arr -> arr[0])
        //         .collect(Collectors.toList());
        // System.out.println(fb);

        String str = "News Wala";

        System.out.println(str.equalsIgnoreCase("n"));
    }
}