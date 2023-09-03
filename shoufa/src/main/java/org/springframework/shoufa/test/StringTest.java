package org.springframework.shoufa.test;

public class StringTest {


	public static void main(String[] args) {
		String a = "abcd";
		String b = new String("abcde");
		System.out.println(a == "abcd");
		System.out.println(b == "abcd");
		Integer c = 128;
		Integer e = 128;
		System.out.println(c == e);
		Integer a1 = 127;
		Integer a2 = 127;
		System.out.println(a1 == a2);

		System.out.println(8 >>> 1);
//		System.out.println((1 << 30) >>> 1);
	}
}
