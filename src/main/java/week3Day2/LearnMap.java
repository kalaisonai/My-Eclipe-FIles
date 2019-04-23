package week3Day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="kalaiselvi";
		Map<Character, Integer> mapObj=new LinkedHashMap<Character, Integer>();
		
		char[] charArray=name.toCharArray();
		
		for(char c:charArray) {
			
			if (mapObj.containsKey(c)) {
				mapObj.put(c, mapObj.get(c)+1);
			} else {

				mapObj.put(c, 1);
			}
			
		}
		System.out.println(" Map "+mapObj);
	}

}
