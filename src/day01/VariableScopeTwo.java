package day01;

public class VariableScopeTwo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d;
		
		if(true) {
			d = 40;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
