import java.util.*;

class UserInp{
	int[] userinp(){
		int[] n = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fisrt number");
		n[0] = sc.nextInt();
		System.out.println("Enter 2nd number");
		n[1] = sc.nextInt();

		return n;
		
	
	}
}