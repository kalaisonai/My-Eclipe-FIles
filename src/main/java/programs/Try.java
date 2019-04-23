package programs;

public class Try {

	public void finalize(){
		System.out.println("finalize called");
	}  
	public static void main(String[] args){  
		Try f1=new Try();  
		Try f2=new Try();  
		f1=null;  
		f2=null;  
		System.gc();
	}

}
