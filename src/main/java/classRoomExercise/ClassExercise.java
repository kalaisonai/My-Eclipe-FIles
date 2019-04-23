package classRoomExercise;

public class ClassExercise {
	public void palindrome(String name) {
		//String name="madam";
		String rev="";
		char[] charArray = name.toCharArray();
		for (int j=charArray.length-1;j>=0;j--)
		{
			rev=rev+charArray[j];
			System.out.println(charArray[j]);

			//how to convert char to String
		}
		System.out.println(rev);
		System.out.println(charArray);
		if(name.equals(rev))
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not Palindrome");

	}

	public void companyName(String cmpName) {
		char[] charArray = cmpName.toCharArray();
		//String[] split = cmpName.split("");
		String replace = cmpName.replace(" ","").toLowerCase();
		System.out.println(replace);
		//To find T
		char first=' ';
		int j=0;
		first=replace.charAt(replace.length()-1);
		System.out.println("first"+first);
		for (int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==first) 
			{
				j++;
			}

		}
		System.out.println("first letter count " + j);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExercise name=new ClassExercise();
		name.palindrome("madam");
		name.companyName("tata Consultancy Services");

	}

}
