package practice_Question.learn.string;

public class StringBasic {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		String str = "Hello";

		String str1 = str.toUpperCase();
		System.out.println(str1 + " " + str1.length());

		// for (int i = str1.length()-1; i >= 0; i--) {
		// // System.out.println(i);
		// System.out.print(str1.charAt(i));
		// }
		// System.out.println();

		// char ch = str.charAt(0);
		// System.out.println(ch);

		 int idx = str.indexOf('o');
		 System.out.println(idx);

	}

}
