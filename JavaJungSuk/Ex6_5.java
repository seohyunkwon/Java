import java.lang.ProcessHandle.Info;

public class Ex6_5 {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿",1,1,100,60,76);
		System.out.println(student.info());
		
		
	
	}
}

class Student{
	String name;
	int ban; int no; int kor; int eng; int math;
	
	Student(){}
	Student(String name,int ban,int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage() {
		return  (int)(getTotal()/3f*10+0.5)/10f;
	}
	
	String info(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
}	
	
	
