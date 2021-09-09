package day01;

public class Casting03 {
	public static void main(String[] args) {
		// 연산에서의 형변환
		char c = 'A';
		int i = 2;

		// 1. 서로 다른 타입의 연산에서는 큰 타입을 따라간다.
		char cc = (char) (c + i); // why? 형변환 법칙때문에. c + i는 int형이 된다. 이유는 cpu가 하는 일에 대한 이해가 필요하다.
		// 컴퓨터에서 연산 기능을 담당하는 cpu. cpu는 크기가 작은 것과 큰 것을 연산함에 있어 큰 것을 자르는 것이 아닌 작은 것을 늘리는
		// 방식을
		// 채택한다. 잘라버리는 것 보다 차라리 전부 다 가지고 가는 것이 안전하다는 논리를 가지고 있기 때문.

		System.out.println(cc);

		int j = 10;
		double d = 3.14;
		System.out.println(j + d); // 13.14

		// 2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte k = 1;
		short l = 20;
		System.out.println(k + l);
		
		short s1 = 100;
		byte s2 = 12;
		System.out.println(s1 + s2);
		
		//타입을 알아볼 수 있는 함수가 있기는 한데 아직 우리가 할 수준은 아니라고 한다.
		
		//결과 해석이 중요. casting과 같이 두 가지 꼭 기억할 것.
	}
}
