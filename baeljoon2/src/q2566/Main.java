package q2566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=0;
		
		int[][] ary=new int[9][9];
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				ary[i][j]=sc.nextInt();
				if(ary[i][j]>=max)
				{
					max=ary[i][j];
				}
			}
		}
		sc.close();
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(ary[i][j]==max)
				{
					System.out.println(ary[i][j]);
					System.out.println((i+1)+" "+(j+1));
				}
			}
		}

	}

}
