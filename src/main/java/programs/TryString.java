package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class TryString {
	final String myName="kalai";
	static String name="selvi";
	public String string="I am doing good";
	
	//Reversed String using for loop 
	public void revString() {
		//String string="I am doing good";
		System.out.println("first static "+name);
		name="Sonai";
		String str1="";
		char[] charArray = string.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			str1=str1+charArray[i];			
		}
		System.out.println("Reversed String using for loop "+str1);
		System.out.println("final "+myName);
		System.out.println("static "+name);
	}
	//Reverse String using String Builder
	public void revString1() {
		//String string="I am doing good";
		StringBuilder input1 = new StringBuilder(); 
		input1.append(string); 
		input1.reverse();
		System.out.println("Reverse String using String Builder "+input1);

	}
	//Print occurrences of each character in a given String suing Map
	public void findOccurance() {
		string=string.replace(" ", "");//--to RemoveTo space
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		char[] charArray = string.toCharArray();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println("Find Occurance using Map "+map);		

	}


	public void stringTest(){

		String result="";
		StringBuilder sb = new StringBuilder(string);

		while(sb.length() != 0){
			int count = 0;
			char test = sb.charAt(0);
			while(sb.indexOf(test+"") != -1){
				sb.deleteCharAt(sb.indexOf(test+""));
				count++;
			}
			System.out.println(test+" is repeated "+count+" number of times");
			result=result+test+count;
		}
		//System.out.println(result);         
	}


	public static void main(String[] args) {
		TryString strObj= new TryString();
		strObj.revString();
		strObj.revString1();
		strObj.findOccurance();
		strObj.stringTest();

	}

}
