// �Ҽ��� ��° �ڸ����� �ݿø�

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
		
//		Q. 3.141�� ������ �ʹٸ�?
		
		System.out.println((int)(pi*1000)/1000.0);
		System.out.println((int)(pi*1000)/1000); // .0���� �����ֱ� ����!
		
	}
}

/* Math.round(pi * 1000) / 1000.0
 Math.round(3.141592 * 1000) / 1000.0
 Math.round(3141.592) / 1000.0
 3142 / 1000.0
 3.142 */