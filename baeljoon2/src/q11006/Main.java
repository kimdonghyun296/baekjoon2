package q11006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int[][] ary=new int[num1][2];
		
		
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<2;j++)
			{
				ary[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<num1;i++)
		{
			ary[i][0]=(ary[i][1]*2)-ary[i][0];
			ary[i][1]=ary[i][1]-ary[i][0];
			System.out.printf("%d %d", ary[i][0],ary[i][1]);
			System.out.println();
			
		}
	}

}
