package week3Day1;
public class HomeWork {
	public void primeFind() {
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					count++;
			}
			if(count<=2)
				System.out.println(i +" is Prime a number");
			else if (count>2) 
				System.out.println(i +" is not a Prime number");
		}
	}
	public void firstLetterUpper() {
		String givenText="this program is to capitalize the first char of sentence";
		System.out.println("Given string is - "+givenText);
		String[] split=givenText.split(" ");
		String name=" ";
		for(String element:split) {
			//System.out.println("Split "+element);
			char[] charArray=element.toCharArray();
			charArray[0]=Character.toUpperCase(charArray[0]);
			for(int i=0;i<charArray.length;i++) {
				name=name+charArray[i];
			}
			name=name+ " ";
		}
		System.out.println("Result String is - "+name);
	}
	public void repeatChar() {
		int tmp=0;
		int k=0;
		String name="Kalaiselvi Sonai";
		String myName=name.replaceAll(" ", "");
		String lowerCase = myName.toLowerCase();
		System.out.println("String without space "+lowerCase);
		char[] charArray=lowerCase.toCharArray();

		for(int j=0;j<charArray.length;j++) {
			int countChar=1;
			char ch1=charArray[j];
			for(int i=j+1;i<charArray.length;i++) {
				char ch2=charArray[i];
				if(ch1==ch2) {
					countChar++;
				}
				if(countChar>tmp) {
					tmp=countChar;
					k=i;
				}
			}
		}
		System.out.println("count is "+tmp+ " and char is "+charArray[k]);	
	}
	public static void main(String[] args) {
		HomeWork obj=new HomeWork();
		obj.primeFind();
		System.out.println("*****************************");
		obj.firstLetterUpper();
		System.out.println("*****************************");
		obj.repeatChar();
	}

}