import java.util.*;
class calc{
	public static void main(String[] args){
		int[] num;
		UserInp u1 = new UserInp();
		num  = u1.userinp();
		int sum = num[0] + num[1];
		System.out.println("Sum is:" + sum);
		
	
	}
}