package day01;

public class DataTypeTwo {
	public static void main(String[] args) {
//		char c1 = 'E';
		char c2 = 65; 			// 오 이건 좀 신기함. 왜 가능하지? 아스키코드에 지정된 문자로 출력되기 때문. 비슷한 유니코드를 배웠다.
		System.out.println(c2);

		// 유니코드의 등장 → 2byte 크기의 66536가지의 문자를 표현이 가능해짐.
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; // \\u는 유니코드를 표현하는 탈출문자
		System.out.println(c4);
		System.out.println(c5);

		System.out.println(c3 + "" + c4 + "" + c5);
		// 중간에 쌍 따옴표를 왜 집어넣었을까? 안집어넣으면 값이 합쳐진다! char형은 숫자를 기반으로 하기 때문에 더하면 숫자들이 더해짐

		// 문자열은 클래스이기 때문에 숫자로 더해지지 않고 문자를 단순 붙이는 효과를 보인다.
		String s1 = "hello";
		String s2 = " world";
		String s3 = " java";

		System.out.println(s1 + s2 + s3);
		// 문자열은 길이를 가진다.
		System.out.println("s1 문자열의 길이는 " + s1.length());

		// 문자열과 다른 데이터 타입의 +연산
		System.out.println(100 + 200);
		System.out.println(100 + "200");
		System.out.println(100 + 200 + "300");
		System.out.println("300" + 200 + 100);

		System.out.println("3" + 00 + 200 + 100);
		System.out.println('A' + 10);
		System.out.println("A" + 10);

		// 문자열이 아닌 다른 데이터타입은 계산을 하는 법칙이 있음. 무슨 법칙일까? 법칙을 이해하기 위해선 형변환을 이해해야 함.
		
		System.out.println('가' + 'A');
		System.out.println('가'+""+'A');

	}
}
