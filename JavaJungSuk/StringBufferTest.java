//	String과 StringBuffer의 차이
//	String은 수정이 불가하고 StringBuffer는 가변(mutable)
//	String은 concat메서드를 사용해 수정이 가능하긴 하지만 주소 값이 변경된다.
//	StringBuffer는 append메서드를 사용해 수정이 가능하고 주소값도 그대로다.

public class StringBufferTest {
	public static void main(String[] args) {
		String string = "hell";
		StringBuffer sBuffer = new StringBuffer("hell");
		System.out.println("1. String, StringBuffer 수정 전 hashcode() ");
		System.out.println("String 주소 : "+string.hashCode());
		System.out.println("StringBuffer 주소 : "+sBuffer.hashCode());
		String string2 = string.concat("o");
		sBuffer.append("o");
		System.out.println("-");
		System.out.println("2. String, StringBuffer 수정 후 hashcode()와 결과값");
		System.out.println("String 주소 : "+string.hashCode());
		System.out.println("String2 주소 : "+string2.hashCode());
		System.out.println("StringBuffer 주소 : "+sBuffer.hashCode());
		System.out.println("String 값 : "+string);
		System.out.println("String2 값 : "+string2);
		System.out.println("StringBuffer 값 : "+sBuffer);
		
	}
}
