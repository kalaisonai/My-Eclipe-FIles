package classRoomExercise;

public class VehicleType {

	public void wheelCount(int wheel) {
		System.out.println("Inside If loop");
		if(wheel==2)
			System.out.println("Your vehicle has 2 wheels");
		else if(wheel==3)
			System.out.println("Your vehicle has 3 wheels");
		else if(wheel==4)
			System.out.println("Your vehicle has 4 wheels");
		else
			System.out.println("Your vehicle must be load vehicle!!");
		}
	public void wheelSwitch(int wheelnumber) {
		System.out.println("Inside Switch case loop");
	
		switch(wheelnumber){
		case 2: System.out.println("Your vehicle has 2 wheels");
		break;
		case 3: System.out.println("Your vehicle has 3 wheels");
		break;
		case 4: System.out.println("Your vehicle has 4 wheels");
		break;
		default:System.out.println("Your vehicle must be load vehicle!!");
		break;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleType wheels=new VehicleType();
		wheels.wheelCount(9);
		VehicleType wheel=new VehicleType();
		wheel.wheelCount(5);

	}

}
