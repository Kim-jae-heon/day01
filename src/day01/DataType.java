package day01;

public class DataType {
	public static void main(String[] args) {
//		byte a = 128; 							// 127까지 저장할 수 있는데 128을 초기화하였으므로 에러가 난 것.
		byte a1 = 127;

		short b = 32767; // 2^15 - 1
		short b1 = -32768; // short는 많이 사용되지 않는다.

		int c = 2147483647;
		int c1 = -2147483648;

		long d = 2147483648L; // long type은 L과 함께할 것.
		long d1 = 2147483649L;
		System.out.println(d);

		// 진수의 형태로도 저장을 할 수 있다.
		/*
		 * 2진수 값으로 저장을 할 때는 0b를 붙여저장한다. 8진수 값으로 저장을 할 때는 0을 붙여저장한다. 16진수 값으로 저장을 할 때는
		 * 0x를 붙여저장한다.
		 */
		int bin = 0b1010; // 이렇게도 저장이된다. 16진수는 10이 A, 11이 B, 12는 C, 13은 D로 표현이 된다.
		System.out.println(bin);

		// 2진수 10의 값은 변수입니다를 선언하고 싶음.
		System.out.println("2진수 1010의 값: " + bin); //+연산자를 사용할 수 있다는 것은 계속해서 붙여나갈 수 있다는 뜻.
		System.out.println("-----------------------------------------------");
		
		//실수형
		float f1 = 3.14F; 				//F꼭 붙일 것. 기본적으로 소수점 7자리까지 유효하다는 것에 유의. 더 표현될 수 있으나 기본적으로는 
										//7자리이다. 
		double g1 = 3.14;				//소수점 15자리까지 유효하다는 것에 유의.
		System.out.println(g1);
		
		//e표기법. 읽을줄만 알면 된다.숫자가 너무 길어지면 이렇게 된다. e-2는 10의 -2승이다. 확인만 할줄 알면 된다.
		float f2 = 3.14159265e-2F;
		double g2 = 3.14159265e3; //10의 3승.
		System.out.println(f2);
		System.out.println(g2);
		
		System.out.println("-------------------------------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1); //참or 거짓 그 자체가 들어있음.
		//참, 거짓을 저장하는 형태이다.
		
		System.out.println(0.1*0.01);
	}
}
