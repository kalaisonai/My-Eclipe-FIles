package classRoomExercise;

public class Test {
	int a,b,c;
	public void greatNum(int num1,int num2,int num3) {
		
		if((num1>num2) && (num1>num3))
				{
			System.out.println("Grestest number is "+num1);
				}
		else if(num2>num3)
			System.out.println("Grestest number is "+num2);	
		else
			System.out.println("Grestest number is "+num3);
	}
	public int sumOfTen() {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
//			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
Test GrtNum= new Test();
GrtNum.greatNum(22, 14, 30);
Test totalNum= new Test();
int resultSum=totalNum.sumOfTen();
System.out.println("Total of 1-10 is "+resultSum);

	}

}
