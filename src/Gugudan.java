import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		//������

		//		for(int i=2; i<=9; i++) {
		//			for(int j=1; j<=9; j++) {
		//			System.out.println(i+ " * " + j+ " = " +i*j);
		//			}
		//			System.out.print("\n");
		//		}
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �Է��ϼ���");
		int gu = sc.nextInt();
		if(gu<2||gu>9) {
			System.out.println("2�̻�, 9������ ���� �Է��ϼ���");
		} else {
			System.out.println(gu+"��");
			for (int i=1; i<=9; i++) {
				System.out.println(gu + " * " + i +" = " +gu*i);
			}
		}

	}

}
