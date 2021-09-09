package day01;

public class SystemOut {
	public static void main(String[] args) {
		// main이라고 적고 ctrl + space를 누르면 main이 바로 생성된다.
		/*
		 * 이것은 여러줄 주석 실행단축키 ctrl + f11, sysout 입력 후 ctrl+space누르면 출력문 자동완성 주의점 및 알아두어야
		 * 하는 단축키 무지성 ctrl + c, ctrl + v는 안된다. 전체선택 = ctrl + a 주석단축키(해제키도 동일) = ctrl + /
		 * 되돌리기 = ctrl + z, 문장의 위치를 옮기고 싶을 때 옮기고 싶은 문장에 커서를 놓고 alt + 방향키 지정.
		 * 이름을 한번에 수정 = alt + shift + r, 블록지정 shift + 방향키.
		 */
		// 개행을 포함하는 pritnln()
		System.out.println("안녕하세요");
		System.out.println();
		System.out.println("반가워요~");
		// 개행이 없는 print()
		System.out.println();

		// 형식지정출력문 printf()
		/*
		 * \n은 줄바꿈 \t는 8칸 띄어쓰기(8줄이 아니라 가로로 8칸을 의미로 tab과 같은 효과) %d 숫자형식을 입력받는다는 의미 %s 문자열
		 * 형식을 입력받는다는 의미 %f 실수 형식을 입력받는다는 의미
		 */
		System.out.printf("오늘은 %d.%d.%d입니다", 2021, 8, 2);
		System.out.printf("\n" + "원주율은 %f입니다", 3.141592);
		System.out.printf("\n" + "제 이름은 %s 입니다", "김재헌");
	}
}
