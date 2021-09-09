package day01;

public class VariableScope {
	public static void main(String[] args) {
//num1 과 num2는 둘째 중괄호 안에 있기 때문에 if구문 안에서도 작동을 한다.
		int num1 = 10;
		int num2 = 20;
//		int num1 = 10, num2 = 20; 이렇게 적을 수 있으며 이는 스타일에 따라 나뉜다. 근데 낯설다. C언어 스타일이기 때문.
		int num4 = 0;
		if(true) {
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num4 = 100;
			System.out.println(num4);
		}
//그러나 num3은 셋째 중괄호(if구문) 안에 있기 때문에 둘째 중괄호에서 선언한 변수를 사용하면 알아듣지 못한다.
//변수를 밖에서 선언하고 초기화를 안에서 해준다면 사용을 밖에서 할 수 있음.
//		System.out.println(num3); 따라서 num3은 사용이 안됨.
		System.out.println(num4);
//선언을 어디에서 하는지가 중요함. 변수의 범위를 잘 기억해둘 것. 
	}
}
