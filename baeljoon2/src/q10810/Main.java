package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int buket=sc.nextInt();
		int[] ary=new int[buket];
		int num1=sc.nextInt();
		for(int i=0;i<num1;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			for(int j=a-1;j<b;j++)
			{
				ary[j]=c;
			}
		}
		
		sc.close();
		
		for(int i=0;i<buket;i++)
		{
			System.out.printf("%d ", ary[i]);
		}
	}

}
