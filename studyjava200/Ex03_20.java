import java.util.Random;

public class Ex03_20 {
	public static void main(String[] args) {
//		int rand=(int)(Math.random()*3);
		Random random = new Random();
		int k = random.nextInt(3);
		System.out.println(k);
		
//		if(k==0) {System.out.println("����");} 
//		else if(k==1) {System.out.println("����"); }
//		else {System.out.println("��");}
		
		switch(k) {
		case 0 : System.out.println("����"); break;
		case 1 : System.out.println("����"); break;
		case 2 : System.out.println("��"); break;
		}
		
		
	}

}
