package day01;

public class Casting01 {
	public static void main(String[] args) {
		byte b = 10;
		short s = b; // 당연해 보이지만 byte → short로 자동형변환이 일어난 것
		b = (byte) s; // 형변환을 직접 사용할 때 작은 타입을 넣어주었다는 것에 유의.
		System.out.println(s);

		int i = b; // byte → int로 자동형변환이 일어난 것
		long l = b; // byte → long으로 자동형변환이 일어난 것
		// JVM이 이런것들을 자동으로 해주는 것. 프로그램 돌릴 때 자동으로 해준다..!

		// 크기가 작은 타입을 큰 타입에 대입할 때는 JVM(Java Virtual Machine)이 자동으로 형변환을 진행한다.

		System.out.println(s);
		char c = '가';
		int a = c; // char형이 int형으로 자동형변환이 되었기 때문에 즉, char형이 int형으로 들어갔기 때문에 숫자가 나온다.

		System.out.println("가의 유니코드 숫자값: " + a);

		int k = 1000;
		double d = k; // int -> double형으로 자동형변환
		System.out.println(d); // 실수라서 소수점이 나온다는 점에 유의. 한 줄 삭제 ctrl + d
		
		//파일 하나만 변환
	}
}
