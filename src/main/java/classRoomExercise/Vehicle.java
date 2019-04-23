package classRoomExercise;

public class Vehicle {

	String model;
	char logoFistLetter;
	int light;
	public void applyBrake() 
	{
		System.out.println("Brake is fine!! U can use it");
	}
	public int getNumberOfWheel()
	{
		return 4;	
	}
	public boolean isPunctured()
	{
		return true;
	}
	public int numberOfLights(int front,int back)
	{
		int totalLights=front+back;
		return totalLights;
		
	}
	public static void main(String[] args) {
		Vehicle veh= new Vehicle();
		veh.applyBrake();
		int wheel= veh.getNumberOfWheel();
		System.out.println("Number of wheel is "+ wheel);
		boolean puncture=veh.isPunctured();
		if (puncture==false)
			System.out.println("Your wheels are perfect");
		else
		System.out.println("Oops!!! Check ur wheel!!");
		int sumOfLights=veh.numberOfLights(2, 2);
		System.out.println("Total Lights"+sumOfLights);
		System.out.println("Well Done");
			
		
	}
	}

