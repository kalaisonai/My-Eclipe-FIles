package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork2 {
	/*3. Implement the program to check ArithmeticException
	4. Find the duplicate character using map--->Completed
	5. Remove duplicates in list and print in sorting
	   order--->Completed*/

	public void DuplicateList() {
		String[] strings= {"Kalai","Selvi","Sonai","Thiru","Sonai","Praba","Selvi","Kalai"};
		List<String> listObj=new ArrayList<String>();
		List<String> listDupObj=new ArrayList<String>();
		for (int i=0;i<strings.length;i++) {
			if(!listObj.contains(strings[i]))
				listObj.add(strings[i]);
			else
				listDupObj.add(strings[i]);
		}
		System.out.println("List without duplicates "+listObj);
		Collections.sort(listObj);
		System.out.println("Sorted list without duplicates "+listObj);
		System.out.println("Duplicate list "+listDupObj);
	}
	public void duplicateChar(String s) {
		Map<Character, Integer> mapObj=new HashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if(mapObj.containsKey(c))
				mapObj.put(c, mapObj.get(c)+1);
			else
				mapObj.put(c, 1);
		}
		System.out.println(" Map "+mapObj);
		Set<Character> keySet = mapObj.keySet();
		for (Character character : keySet) {
			if(mapObj.get(character)>1)
				System.out.println("Duplicate char "+character+" is displayed "+mapObj.get(character)+" times");
		}

	}

	public void ArithException() {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.err.println("Arithmatic Exception, Can not be divided by Zero ");
		}
	}

	public void Exceptions() throws InterruptedException  {
		Thread.sleep(1000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork2 obj=new HomeWork2();
		System.out.println("Remove duplicates in list and Sort");
		System.out.println();
		obj.DuplicateList();
		System.out.println();
		System.out.println("Findling duplicate char using map");
		System.out.println();
		obj.duplicateChar("kalaiselvi");
		System.out.println();
		System.out.println("Program to check Arithmatic Exception");
		System.out.println();
		obj.ArithException();

	}

}
