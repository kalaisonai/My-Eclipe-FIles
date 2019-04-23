package dailyExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegEx {
	

public static void main(String[] args) {
	String[] names= {"Kalai7D","Priya7D", "priya7d"};
	//String pat="[a-zA-Z0-9]{7}";
	//String pat=".{7}";
	String pat="[Pa-z0-9D]{7}";
	Pattern compile = Pattern.compile(pat);
	
	for (String string : names) {
		Matcher matcher=compile.matcher(string);
		System.out.println(string+" matches? "+matcher.matches());
		
	}
}

}
