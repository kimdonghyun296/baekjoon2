package q2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int[][] ary1=new int[num1][num2];
		int[][] ary2=new int[num1][num2];
		int[][] ary3=new int[num1][num2];
		
		
			for(int b=0;b<num1;b++)
			{
				for(int c=0;c<num2;c++)
				{
					ary1[b][c]=sc.nextInt();
				}
			}
		
			
			for(int d=0;d<num1;d++)
			{
				for(int e=0;e<num2;e++)
				{
					ary2[d][e]=sc.nextInt();
				}
			}
			sc.close();
			
			for(int f=0;f<num1;f++)
			{
				for(int g=0;g<num2;g++)
				{
					ary3[f][g]=ary1[f][g]+ary2[f][g];
					System.out.printf("%d ", ary3[f][g]);
				}
				System.out.println();
			}
			
	}
}
