package exam.ifTest;

public class switchTest {
	public static void main(String[] args) {
		int total= 87;
		switch(total/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("aa");
		}
	}

}
