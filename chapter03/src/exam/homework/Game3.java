package exam.homework;

import java.util.Scanner;

public class Game3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while(count<=4){

			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			System.out.println("숫자를 입력하세요");
			String input = scan.nextLine();
			//System.out.println(input);
			char tmp;
			boolean output = true;

			for(int i = 0 ; i<input.length();i++) {
				tmp=input.charAt(i);

				if(!('0' <= tmp && tmp <= '9')) {
					output = false;
				}
			}
			System.out.println("숫자여부 : "+output);
			if(output) {
				int player = Integer.parseInt(input);

				if(player>=1 && player <=6) {
					if(com==player) {
						System.out.println("정답");
						count=++count;
					}else {
						System.out.println("다음기회를");
					}
				}else {
					System.out.println("숫자범위를 벗어났습니다.");
				}
			}
		}
			System.out.println(count + "번 맞췄습니다.");
		

	}
}
