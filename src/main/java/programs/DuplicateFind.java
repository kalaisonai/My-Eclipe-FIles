package programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateFind {
	int[] arr= {1,3,9,7,8,7,8,9};
	//Using For loop
	public void forLoop() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])			{		
					System.out.println("For loop concept duplicates "+arr[i]);
					break;//to come out of loop if done 
				}
			}
		}
	}

	//Using Array Sort
	@Test
	public void arraySort() {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1])
			{
				System.out.println("Sort concept duplicates "+arr[i]);
			}
		}
	}
	public void setMethod() {
		Set<Integer> set= new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {

			if(set.add(arr[i])==false) {
				System.out.println("Duplicate in Set "+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateFind dup=new DuplicateFind();
		dup.arraySort();
		dup.forLoop();
		dup.setMethod();


	}

}
