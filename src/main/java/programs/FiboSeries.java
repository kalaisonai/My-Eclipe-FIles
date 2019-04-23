package programs;

import java.util.Scanner;

public class FiboSeries {

	
		 static int n1=0,n2=1,n3=0;  
		 static void printFibonacci(int count){  
		    if(count>0){  
		         n3 = n1 + n2;  
		         n1 = n2;  
		         n2 = n3;  
		         System.out.print(" "+n3);
		         //count--;
		         printFibonacci(count-1);  
		     }  
		
	}
	
	public static void main(String[] args) {
		int count=10;  
		  System.out.print(n1+" "+n2);//printing 0 and 1  
		  printFibonacci(count-2);
		  
		  int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }

	}

}
