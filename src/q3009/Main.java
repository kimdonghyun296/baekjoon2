package q3009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] ary=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ary[i][j]=sc.nextInt();
			}
		}
		int count=0;
		int num1=0;
		
		int count2=0;
		int num3=0;
		
		
		for(int i=1;i<3;i++)
		{
			if(ary[0][0]==ary[i][0])
			{
				count++;
				
			}
			
			if(ary[0][1]==ary[i][1])
			{
				count2++;
				
			}
		}
		if(count==1)
		{
			if(ary[0][0]==ary[1][0])
			{
				num1=2;
			}
			else if(ary[0][0]==ary[2][0])
			{
				num1=1;
			}
		}
		else if(count==0)
		{
			num1=0;
		}	
		if(count2==1)
		{
			if(ary[0][1]==ary[1][1])
			{
				num3=2;
			}
			else if(ary[0][1]==ary[2][1])
			{
				num3=1;
			}
		}
		else if(count2==0)
		{
			num3=0;
		}
		System.out.printf("%d %d",ary[num1][0],ary[num3][1]);
	}
}
