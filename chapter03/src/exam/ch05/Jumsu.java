package exam.ch05;

import java.util.Scanner;

public class Jumsu {
	public static void main(String[] args) {
		// 10명의 학생 점수를 입력 받을 배열선언
		int jumsu[] = new int[10];
		
		// Scanner를 이용하여 배열에 입력받은 점수를 저장
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(i+1+"번째 학생 점수");
			jumsu[i] = scan.nextInt();
		}
		int sum=0;		
		// 반복문을 이용하여 배열의 점수의 합을 구한다.
		for(int i =0;i<jumsu.length;i++) {
			sum=sum+jumsu[i];
		}		
		// 구한 합에 학생수로 나누어 평균을 구한다.
		System.out.println("점수의 합은"+sum);
		System.out.println("점수의 평균은"+(double)sum/jumsu.length);
		System.out.println(jumsu[10]);
		
		
		
	}

}
