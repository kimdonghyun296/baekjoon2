package q25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum1=sc.nextInt();
		int num1=sc.nextInt();
		int sum2=0;
		for(int i=0;i<num1;i++)
		{
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			
			sum2+=num2*num3;
			
		}
		sc.close();
		if(sum1==sum2)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
