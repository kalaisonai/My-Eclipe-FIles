package homeWork;

public class ExcerciseConstructor {
	
	public ExcerciseConstructor() {
		int b=10;
		System.out.println(b);
	}
	public ExcerciseConstructor(String a) {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		System.out.println("Main");
		ExcerciseConstructor obj=new ExcerciseConstructor();
		ExcerciseConstructor obj1=new ExcerciseConstructor("kalai");
		
		System.out.printf(" "+obj+" "+obj1);

	}

}
