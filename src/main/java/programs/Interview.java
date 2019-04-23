package programs;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[] {11,13,3,7,18,8,9};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("Min value "+num[0]);
		System.out.println("Max value "+num[num.length-1]);

	}

}
