// 소수점 넷째 자리에서 반올림

class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi * 1000));
		System.out.println(Math.round(pi * 1000)/1000);
		System.out.println((double)Math.round(pi * 1000)/1000);
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
//		Q. 3.141만 가지고 싶다면?
		
		System.out.println((int)(pi*1000)/1000.0);
		System.out.println((int)(pi*1000)/1000); // .0으로 나눠주기 주의!
		
	}
}

/* Math.round(pi * 1000) / 1000.0
 Math.round(3.141592 * 1000) / 1000.0
 Math.round(3141.592) / 1000.0
 3142 / 1000.0
 3.142 */