package classRoomExercise;

public class ClassEx {
	public ClassEx(){
		System.out.println();
	}
	public ClassEx(int a) {
		System.out.println("Area of square in Int "+ a*a);
	}
	public ClassEx(float a) {
		System.out.println("Area of square in float "+ a*a);
	}
	public ClassEx(int a,int b) {
		System.out.println("Area of rectangle "+ a*b);
	}
	public ClassEx(float a,int b) {
		System.out.println("Area of rectangle "+ a*b);
	}
	public void classExTri(int a,int b) {
		System.out.println("Area of Triangle "+ 0.5*a*b);
	}
	public void classExTri(float a,float b) {
		System.out.println("Area of Triangle "+ 0.5*a*b);
	}
	//finding odd
	public void arrayOdd() {
		int[] arrayName= {1,2,3,4,5,6,7,8,9,10};
		for(int i:arrayName) {
//		for(int i=0;i<arrayName.length;i++) {
		//if (arrayName[i]%2==0) {
			if(i%2!=0) {
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Square
		new ClassEx(5);
		new ClassEx(5.2f);
		//Rectangle
		new ClassEx(5,3);
		new ClassEx(5.2f,3);
		//Triangle
		ClassEx intTri=new ClassEx();
		intTri.classExTri(3, 5);
		//ClassEx intTri=new ClassEx();
		intTri.classExTri(3.2f, 5.5f);
		//finding odd
		//ClassEx oddNum=new ClassEx();  
		intTri.arrayOdd();
	}

}
