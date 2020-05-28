package exam.ch05;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int student[][]= new int[3][3];
		 int stuTotal[]= new int[3];
		 double stuAvg[]=new double[3];
		 int menu = 0;
		 while(!(menu==3)) {
			 System.out.println("-----------------------------");
			 System.out.println("  1.입력    2.성적처리리스트  3.종료");
			 System.out.println("-----------------------------");
			 System.out.print("메뉴선택>>>");
			 menu=scan.nextInt();
			 switch(menu){
				 case 1:
					 for(int i=0;i<student.length;i++) {
						 System.out.println(i+1+"번 학생 성적입력(국어 영어 수학)");
						 student[i][0]=scan.nextInt();
						 student[i][1]=scan.nextInt();
						 student[i][2]=scan.nextInt();						 
					 }					 
					 break;
				 case 2:
					 for(int i=0;i<student.length;i++) {
						 int total = student[i][0]+student[i][1]+student[i][2];
						 stuTotal[0]=stuTotal[0]+student[i][0];
						 stuTotal[1]=stuTotal[1]+student[i][1];
						 stuTotal[2]=stuTotal[2]+student[i][2];
						 System.out.println(i+1+"번 학생 총점"+total);
						 System.out.println(i+1+"번 학생 평균"+(total/3.0));
						 System.out.printf("%d번 학생의 평균은 %.2f %n",i+1,total/3.0);
						 System.out.println("-----------------------------");
						 					 
					 }
					 System.out.println("전체 학생의 국어 총점은 "+stuTotal[0]);
					 System.out.println("전체 학생의 영어 총점은 "+stuTotal[1]);
					 System.out.println("전체 학생의 수어 총점은 "+stuTotal[2]);
					 stuAvg[0]=(double)stuTotal[0]/student.length;
					 stuAvg[1]=(double)stuTotal[1]/student.length;
					 stuAvg[2]=(double)stuTotal[2]/student.length;
					 System.out.println("전체 학생의 국어평균은 "+stuAvg[0]);
					 System.out.println("전체 학생의 영어평균은 "+stuAvg[1]);
					 System.out.println("전체 학생의 수학평균은 "+stuAvg[2]);
					 break;
				
			 }			 		
		 }
		 System.out.println("프로그램을 종료합니다.");
	}

}
