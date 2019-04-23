package homeWork;

public class StringExercise {

	//to find how many given letter in my name
	public void findLetterInMyName() {
		int charCount=0;
		char letterInName='i';
		String myName="Kalaiselvi Sonai Aravind Prathap raj";
		String nameWOSpace = myName.replaceAll(" ", "");
		System.out.println("My name without space "+nameWOSpace);
		char[] nameArray=nameWOSpace.toLowerCase().toCharArray();
		for(int i=0;i<nameArray.length;i++) {
			if(nameArray[i]==letterInName) {
				charCount++;
			}
		}
		System.out.println("The number of '"+letterInName+ "' in my name is "+charCount);
	}
	public void findGreatNumber() {
		int number=1001;
		int tempNumber=0;
		while(number>0){
			int lastNumber=number%10;
			if(tempNumber<lastNumber) {
				tempNumber=lastNumber;
			}
			number=number/10;
		}
		System.out.println("The greatest number is "+tempNumber);
	}
	public void sumOfAllDigit() {
		int number=918237;
		int sumNumber=0;
		while(number>0) {
			int lastNumber=number%10;
			sumNumber=sumNumber+lastNumber;
			number=number/10;
		}
		System.out.println("Sum of digits "+sumNumber);
	}
	public void fibonacciSeries() {
		int num1=0,num2=1,num3=0;
		System.out.println("Fibo Series ");
		System.out.println(num1);
		System.out.println(num2);
		while(num3<100) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}

	}
	public void factorialNumber(int num) {
		int factNum=1;
		for(int i=1;i<=num;i++) {
			factNum=factNum*i;
		}
		System.out.println("Factorail Number "+factNum);
	}
	public void stringReverse() {
		String givenString="Cognizant";
		String revString="";
		char[] charArray=givenString.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println("Name "+charArray[i]);
			revString=revString+charArray[i];
		}
		System.out.println("Reversed String "+revString);
	}
	public void concateChar() {
		String name="Kalaiselvi";
		String space=" ";
		String name2="Sonai";
		char charAdd='S';
		String concate=name+space+charAdd+space+name2;
		System.out.println(" Concate "+concate);
		String integer="100";
		Integer number=Integer.valueOf(integer);
		System.out.println("String to Int "+number);
		System.out.println(number+20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExercise commonObj=new StringExercise();
		/*commonObj.findLetterInMyName();
		commonObj.findGreatNumber();
		commonObj.sumOfAllDigit();*/
		commonObj.fibonacciSeries();
		/*commonObj.factorialNumber(6);
		commonObj.stringReverse();*/
		commonObj.concateChar();
	}

}
