import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		//구구단

		//		for(int i=2; i<=9; i++) {
		//			for(int j=1; j<=9; j++) {
		//			System.out.println(i+ " * " + j+ " = " +i*j);
		//			}
		//			System.out.print("\n");
		//		}
		Scanner sc = new Scanner(System.in);

		System.out.print("단 을 입력하세요");
		int gu = sc.nextInt();
		if(gu<2||gu>9) {
			System.out.println("2이상, 9이하의 값만 입력하세요");
		} else {
			System.out.println(gu+"단");
			for (int i=1; i<=9; i++) {
				System.out.println(gu + " * " + i +" = " +gu*i);
			}
		}

	}

}
