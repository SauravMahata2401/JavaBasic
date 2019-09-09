package pkg.test;

public class StringTestJava {

	public static void main(String[] args) {

		String text = "Hello World!!";
		String text1 = "Hi World!!";

		System.out.println(text);

		int len = text.length();
		System.out.println(len);

		String sub = text.substring(6, 11);
		System.out.println(sub);

		String trim = text.trim();
		System.out.println(trim);

		String concat = text.concat(text1);
		System.out.println(concat);

		String t1 = "   testuser ";
		int t1_len = t1.length();
		System.out.println("Length before trim: " + t1_len);

		String t2 = t1.trim();
		int t2_len = t2.length();
		System.out.println("Length after trim: " + t2_len);

	}

}
