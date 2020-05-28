package exam.homework;

import java.util.Scanner;

public class Game4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while(count<=4){
			
			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			String player = scan.next();
			System.out.println(player);
			
//			if(player>=1 && player <=6) {
//				if(com==player) {
//					System.out.println("정답");
//					count=++count;
//				}else {
//					System.out.println("다음기회를");
//				}
//			}else {
//				System.out.println("숫자범위를 벗어났습니다.");
//			}
		}
		System.out.println(count + "번 맞췄습니다.");
		
	}
}
