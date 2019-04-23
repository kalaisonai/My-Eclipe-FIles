package homeWork;

import java.util.Arrays;

public class SecondExercise {
	//Feb10th

	public void oddUpperCase() {
		String myName="Kalaiselvi";
		String rev=" ";
		String rev1=" ";
		char[] nameArray=myName.toCharArray();
		//for(int i:nameArray)
		for(int i=1;i<nameArray.length;i+=2) 
		{
			rev=rev+nameArray[i];
		}
		System.out.println("Odd indexed letters of ou name in Uppercase "+rev.toUpperCase());
		for(int j=0;j<nameArray.length;j+=2) 
		{
			rev1=rev1+nameArray[j];

		}
		System.out.println("Even indexed letters of ou name in Uppercase "+rev1.toUpperCase());
	}

	public int charCount() {
		String givenSentence="Welcome To Testleaf Software Solutions!!";
		String withoutSpaceSentence=givenSentence.replace(" ", "");
		System.out.println("The given sentence without space "+withoutSpaceSentence);
		return withoutSpaceSentence.length();
	}
	public void friendsName() {
		String[] nameList= {"Srirampriya","Lavanya","Priya","Raji","Ramya","Saranya","Dhivya","Sri"};
		for(int i=0;i<nameList.length;i++) {
			String getIndividualName=nameList[i];
			//System.out.println("Names "+getIndividualName);
			char firstLetter=getIndividualName.charAt(0);
			if(firstLetter=='S')
				System.out.println("The name start with S is "+ getIndividualName );
		}
	}
	public void armstrongCheck() {
		int number=370;
		int copyNumber=number;
		int num=0;
		while(number>0) {
			int n=number%10;
			num=num+(n*n*n);
			number=number/10;
		}

		if(num==copyNumber)
			System.out.println("Given number "+copyNumber +" is armstrong");
		else
			System.out.println("Given number "+copyNumber +" is not armstrong");

	}
	public void armstrongListCheck() {
		int[] armNumberArray= {1,153,123,407,210};
		for(int i=0;i<armNumberArray.length;i++) {
			int armNum=0;//Then only the value resets to zero while taking next value
			int oneNumber=armNumberArray[i];
			int copyNumber=oneNumber;
			while(oneNumber>0) {
				int n=oneNumber%10;
				armNum=armNum+(n*n*n);
				System.out.println("NUm "+armNum);
				oneNumber=oneNumber/10;
			}
			if(armNum==copyNumber)
				System.out.println("Given number "+copyNumber +" is armstrong");
			else
				System.out.println("Given number "+copyNumber +" is not armstrong");
		}
	}
	public void anagramWordCheck() {
		//String[] nameArray= {"Peek","Keep"};
		String firstString = "Woman Hitler";
		String secondString = "Wealth Minor";
		String firstStringWOSpace=firstString.replaceAll(" ", "");
		String secondStringWOSpace=secondString.replaceAll(" ", "");
		int firstLength=firstStringWOSpace.length();
		int secondLength=secondStringWOSpace.length();
		if (firstLength==secondLength) {
			System.out.println("Length of both Strings are same");
			char[] charFirstArray=firstStringWOSpace.toLowerCase().toCharArray();
			Arrays.sort(charFirstArray);
			String sortedArrayOne = String.valueOf(charFirstArray);
			System.out.println("First sorted word "+sortedArrayOne);
			char[] charSecondArray=secondStringWOSpace.toLowerCase().toCharArray();
			Arrays.sort(charSecondArray);
			String sortedArrayTwo = String.valueOf(charSecondArray);
			System.out.println("First sorted word "+sortedArrayTwo);
			if(sortedArrayOne.equals(sortedArrayTwo))
				System.out.println("Both are anagram");
			else
				System.out.println("Both are not anagram");
		}
		else
			System.out.println("Length not equal, Hence it can't be anagram");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take ur name as input--change every odd index into Uppercase---Done
		//WAP to check Armstrong number
		//WAP to check Armstrong number in given array list
		//count non white space char "Welcome To Testleaf,output=17--Done
		//Create array with list of frnds and print the names starts with s--Done
		SecondExercise commonObj=new SecondExercise();
		commonObj.oddUpperCase();
		int totalChar=commonObj.charCount();
		System.out.println("Total number of char without space is "+totalChar);
		commonObj.friendsName();
		/*commonObj.armstrongCheck();
		commonObj.armstrongListCheck();
		commonObj.anagramWordCheck();*/
	}
}
