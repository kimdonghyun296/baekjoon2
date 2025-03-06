package q2740;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int[][] ary1=new int[num1][num2];
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num2;j++)
			{
				ary1[i][j]=sc.nextInt();
			}
		}
		
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int[][] ary2=new int[num3][num4];
		for(int i=0;i<num3;i++)
		{
			for(int j=0;j<num4;j++)
			{
				ary2[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		int[][] ary3=new int[num1][num4];
		
		for(int a=0;a<num1;a++)
		{
			for(int b=0;b<num4;b++)
			{
				int sum=0;
				for(int c=0;c<num2;c++)
				{
					sum+=ary1[a][c]*ary2[c][b];
				}
				ary3[a][b]=sum;
			}
		}
		
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num4;j++)
			{
				System.out.printf("%d ", ary3[i][j]);
			}
			System.out.println();
		}
		

	}

}
