package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork1 {

	/*1. Write a code to remove duplicates from string
	     input - goodday
	   output - goday--Completed
	2. Create a list of employee name and remove all the names contain 'd' and print it sorting order--Completed*/
		/*public void removeDuplicates() {
		String gvnString="gooddday";
		char[] charArray = gvnString.toCharArray();
		Set<Character> setObj=new LinkedHashSet<Character>();
		for (char c : charArray) {
			setObj.add(c);
		}
		System.out.println(setObj);
		String resultString="";
		for(int i=0;i<setObj.size();i++) {
			Character character = setObj.get(i);----->This is not working
			resultString=resultString+character;
		}
		System.out.println(resultString);
	}*/

	public void EmpList() {
		List<String> empListObj= new ArrayList<String>();
		List<String> empList= new ArrayList<String>();
		CharSequence letter="D";
		CharSequence letter1="d";
		empListObj.add("Divya");
		empListObj.add("Prathi");
		empListObj.add("Deva");
		empListObj.add("Sree");
		empListObj.add("Harish");
		empListObj.add("Sandy");
		System.out.println("Employee list "+empListObj);
		for (int i=0;i<empListObj.size();i++) {
			String string = empListObj.get(i);
			if(!(string.contains(letter) || string.contains(letter1)))
				empList.add(string);
			else
				System.out.println("Name contains d "+string);
		}
		System.out.println("Emp list after removing names with d "+empList);
		Collections.sort(empList);
		System.out.println("Emp list in sorting order " + empList);
	}
	public void removeDuplicates1() {
		String gvnString="gooddday";
		String resultString="";
		List<Character> listObj=new ArrayList<Character>();
		char[] charArray = gvnString.toCharArray();
		for (char c : charArray) {
			if(listObj.contains(c))
				System.out.println("Duplicate "+c);
			else
				listObj.add(c);
		}
		System.out.println(listObj);
		for(int i=0;i<listObj.size();i++) {
			resultString=resultString+listObj.get(i);
		}
		System.out.println("String without duplicate is---"+resultString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork1 obj=new HomeWork1();
		obj.removeDuplicates1();
		System.out.println();
		obj.EmpList();
	}
}
