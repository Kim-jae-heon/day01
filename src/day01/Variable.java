package day01;

public class Variable {
	public static void main(String[] args) {
		
		int num;
		
		num = 25;
		
		System.out.println(num);
		
		//변수의 선언과 초기화를 동시에 하기
		int numTwo = 20;
		numTwo = 100;
		numTwo = 200;
		System.out.println(numTwo);
		
		//수학에만 익숙하다면 생소하게 느껴질 수 있는 문법. 글자를 더하는 방법. 따라서 더하기로 이해하면 오해가 생길 수 있다. 
		int numThree = num + numTwo + 100;
		System.out.println(numThree);
		//변수는 다른 변수의 값 또는 연산의 결과도 저장할 수 있다는 것도 추가적으로 알 수 있다.
		System.out.println("-------------------------------------------------------");
		
		int a;
		int b;
		int result;
		
		a = 10;
		b = 20;
		result = a+b;
		System.out.println(result);
		result = 1000;
		System.out.println(result);
		
		System.out.println("-------------------------------------------------------");
		//긴 문자, 문자열도 저장할 수 있다.
		String name = "홍길동";
	}
}
