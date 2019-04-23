package homeWork;

import java.util.Arrays;
import java.util.Scanner;
//Feb09th
public class FirstExercise {
	//To check the prime number
	boolean prime;
	public void primeFind() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=input.nextInt();
		Boolean flag=false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
			if(!flag)
				System.out.println(number+" is not a prime");
			else
				System.out.println(number +" is a prime ");
			
				
		}
		
	}
	/*public void primeFindAll() {
		for (int num=5;num<20;num++)
		{
		for(int i=2;i<=num/2;i++)
		{
			System.out.println("reminder"+num%i);
			if(num%i==0)
			{
				prime=true;
			}
		}

		if(prime==true)
			System.out.println(num + " is not a prime number");
		else
			System.out.println(num + " is a prime number");
	}
	}*/
	public int oddSum() {
		int sum = 0;
		for (int i=0; i<=20; i++)
		{
			if(i%2!=0) {
				sum=sum+i;
				System.out.println("sum"+sum);
			}
		}
		return sum;
	}
	public int evenSum() {
		int sum = 0;
		for (int i=0; i<=20; i++)
		{
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

	public void carNames() {
		String[] carList={"Maruthi","Honda","Dutson","Hundai","Mahindra","BMW","Ferrari","Benz","Audi","RollsRoys","Nissan","Volvo","TATA","Ford"};
		//To print the array list
		System.out.println("List of cars");
		for(int i=0;i<carList.length;i++) {
			System.out.println(carList[i]);
		}
		System.out.println("List of cars in Alphabet order");
		Arrays.sort(carList);
		for(int i=0;i<carList.length;i++) {
			System.out.println(carList[i]);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime number
		int num=3;
		FirstExercise primeNumer=new FirstExercise();
		FirstExercise sumOfOdds=new FirstExercise();
		FirstExercise sumOfEven=new FirstExercise();
		FirstExercise arraysort=new FirstExercise();
		//Prime number
		primeNumer.primeFind();
		/*if(result==true)
			System.out.println(num + " is not a prime number");
		else
			System.out.println(num + " is a prime number");*/
		/*System.out.println("List of numbers between 1-20");
		primeNumer.primeFindAll();*/
		//Sum of odd numbers
		int total=sumOfOdds.oddSum();
		System.out.println("Sum of odd numbers between 1-20 is "+total);
		//Sum of even numbers
		int total1=sumOfEven.evenSum();
		System.out.println("Sum of odd numbers between 1-20 is "+total1);
		//Array sorting
		arraysort.carNames();
	}

}
