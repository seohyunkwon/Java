import java.util.Random;

/* ������ ���� ���α׷��� �ۼ�����.
   �� �ڸ� ���� ������(��, 1�̻� 9������ ��)�� �������� �����ؼ� ǥ��
   �� �ڸ� ���� ������(��, -9�̻� -1������ ��)�� �������� �����ؼ� ǥ��
   ���ڸ� ���� ������(��, 10�̻� 99������ ��)�� �������� �����ؼ� ǥ��
 */

public class Ex2_11 {
	public static void main(String[] args) {

		Random random = new Random();
		
		int a = random.nextInt(9-1+1);
		System.out.println(a);
		
		int b = random.nextInt((-1)-(-9)+1);
		System.out.println(b);
		
		int c = random.nextInt(99-10+1);
		System.out.println(c);
	}

}
