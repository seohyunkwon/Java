import java.util.*;

public class Ex16435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int L =sc.nextInt();
		int[] length = new int[N];
		for(int i=0; i<N; i++) {
			length[i]=sc.nextInt();
		}
		Arrays.sort(length);
		
		for(int i=0; i<N; i++) {
			if(L>=length[i]) L += 1;
			else break;
		}
		
		System.out.println(L);
	}
}
