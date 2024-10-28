package practice_Question.learn.opsV2;

public class Test {
    public static void main(String[] args) {
        String val = upperCase("   Ram Pujan pandit");
        System.out.println(val);

        int sum = sum(1, 2,3);
        System.out.println(sum);
        
        
    }


    public static  String upperCase(String str){
        return str.trim().toUpperCase();
    }


    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
