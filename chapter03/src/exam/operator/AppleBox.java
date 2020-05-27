package exam.operator;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과 갯수를 입력하세요");
		int apple = scan.nextInt();
		System.out.println("박스당 갯수를 입력하세요");
		int perBox = scan.nextInt();
		int box = apple/perBox;
		int remainder =apple % perBox;
		System.out.println("사과의 총 개수는 "+apple);
		System.out.println(box+"박스 "+remainder+"개");
	}
}
