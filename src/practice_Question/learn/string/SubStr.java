package practice_Question.learn.string;

public class SubStr {
    public static void main(String[] args) {

        String str = "abcd";

        for(int i = 0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
        
    }
}
