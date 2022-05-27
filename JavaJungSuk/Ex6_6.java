
public class Ex6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		
		return Math.sqrt(Math.pow(x-x1, 2.0)+Math.pow(y-y1, 2.0));
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
