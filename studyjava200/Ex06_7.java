import java.util.Scanner;

public class Ex06_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("사람수 :");
		int n = scanner.nextInt();
		int[] t = new int[n];
		System.out.println("점수를 입력하세요.");
		
		int sum=0;
		for(int i=0; i<n; i++) {
		System.out.print((i+1)+"번의 점수 :");
		t[i] = scanner.nextInt();
		sum += t[i];
		}
		
		int max=t[0];
		int min=t[0];
		for(int i=0; i<n; i++) {
			if(max<t[i]) {max = t[i];}
			if(min>t[i]) {min = t[i];}
			
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum/n));
		System.out.println("최고점 : "+(max));
		System.out.println("최저점 : "+(min));
	}
}
