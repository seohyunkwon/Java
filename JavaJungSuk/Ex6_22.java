class Ex6_22{
	public static boolean isNumber(String str) {
		if (str==null || str.equals("")) return false;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
		if (ch<'0' || ch>'9') return false;
		
		}
		return true;
	}

	public static void main(String[] args) {
		String string="123";
		System.out.println(isNumber(string));
		string = "123o";
		System.out.println(isNumber(string));
	}
	
	
	
	
}