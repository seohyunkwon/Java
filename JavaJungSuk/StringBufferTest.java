//	String�� StringBuffer�� ����
//	String�� ������ �Ұ��ϰ� StringBuffer�� ����(mutable)
//	String�� concat�޼��带 ����� ������ �����ϱ� ������ �ּ� ���� ����ȴ�.
//	StringBuffer�� append�޼��带 ����� ������ �����ϰ� �ּҰ��� �״�δ�.

public class StringBufferTest {
	public static void main(String[] args) {
		String string = "hell";
		StringBuffer sBuffer = new StringBuffer("hell");
		System.out.println("1. String, StringBuffer ���� �� hashcode() ");
		System.out.println("String �ּ� : "+string.hashCode());
		System.out.println("StringBuffer �ּ� : "+sBuffer.hashCode());
		String string2 = string.concat("o");
		sBuffer.append("o");
		System.out.println("-");
		System.out.println("2. String, StringBuffer ���� �� hashcode()�� �����");
		System.out.println("String �ּ� : "+string.hashCode());
		System.out.println("String2 �ּ� : "+string2.hashCode());
		System.out.println("StringBuffer �ּ� : "+sBuffer.hashCode());
		System.out.println("String �� : "+string);
		System.out.println("String2 �� : "+string2);
		System.out.println("StringBuffer �� : "+sBuffer);
		
	}
}
