import java.util.Scanner;

public class Gugudan {

	Scanner sc = new Scanner(System.in);
	
	public void calculate() {
		System.out.println("단을 입력하시오");
	int times = sc.nextInt();
	int[] result;
		for(int i=2; i<=times;i++) {
		System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + " = "+ i*j);
			}
	}
		
		
	}
	
	
	
	public void calculate2() {
		System.out.println("단을 입력하시오. (a,b)");
		String times = sc.next();
		String[] split = times.split(",");
		
		int first =Integer.parseInt(split[0]);
		int last =Integer.parseInt(split[1]);
		
		
		for(int i=2; i<=first; i++) {
			for(int j=1; j<=last; j++) {
				System.out.println(i + "*" + j + " = "+ i*j);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
