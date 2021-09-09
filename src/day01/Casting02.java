package day01;

public class Casting02 {
	public static void main(String[] args) {
		int i = 65;
		char c = (char) i;
		System.out.println(c);
		short s = (short) i;
		System.out.println(s);
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할 때는 (type)캐스팅을 이용하여 명시적으로 변환해야 한다.
		 */

		double d = 3.14;
		int k = (int) d;
		System.out.println(k); // double형이 int형으로 되었으므로 소수점 아래 부분은 다 잘려나가고 3이되어 나타난다.

		int a = 1000;
		byte b = (byte) a;
		System.out.println(b);
		//byte가 저장할 수 있는 값은 -2^7 ~ 2^7-1까지이다. 그러나 1000은 2진수로 바뀌게 된다면 11 1110 1000이 나오는데
		//8bit까지만 저장이 가능하므로 앞의 11을 짤리게 됨. 따라서 1110 1000이 나오게 되는데 가장 왼쪽의 숫자가 1인 경우에는 음수
		//임을 고려하였을 때 우리가 실질적으로 고려해야 하는 것은 110 1000이 되게 됨. 이게 십진수로 -24임. 
		
		//char, short는 예외적으로 명시적 형변환을 해야한다. 작은 숫자로 숫자놀음하지 않고 큰 덩어리를 다시 큰 덩어리로 바꿀 때
		//사용을 하게된다.
		char cc = 'A';
		short ss = (short) cc;
		System.out.println(ss);
	}
}
