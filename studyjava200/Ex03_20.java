import java.util.Random;

public class Ex03_20 {
	public static void main(String[] args) {
//		int rand=(int)(Math.random()*3);
		Random random = new Random();
		int k = random.nextInt(3);
		System.out.println(k);
		
//		if(k==0) {System.out.println("가위");} 
//		else if(k==1) {System.out.println("바위"); }
//		else {System.out.println("보");}
		
		switch(k) {
		case 0 : System.out.println("가위"); break;
		case 1 : System.out.println("바위"); break;
		case 2 : System.out.println("보"); break;
		}
		
		
	}

}
