package peng;

import java.io.PrintStream;
import java.util.Arrays;

public class Print {
	public static void printnb(Object object){
		System.out.print(object);
	}
	public static void printbn(Object[] object) {
		System.out.print(Arrays.toString(object));
	}
	
	public static void print() {
		System.out.println();
	}
	public static void print(Object object){
		System.out.println(object);
	}
	public static void print(Object[] object) {
		System.out.println(Arrays.toString(object));
	}
	
	public static PrintStream printf (String format, Object... args) {
		return System.out.printf(format, args);
	}
	
	//������飿
	//�������ָ���
	public static void main(String...args) {
		String[] ss = {"aaa","bbb","ccc",};
		Object o = ss;
		System.out.println(o);
		print(ss);
		System.out.println(ss.getClass());
	}
}
