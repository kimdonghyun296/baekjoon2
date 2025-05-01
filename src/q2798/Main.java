package q2798;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int[] ary=new int[num1];
		for(int i=0;i<num1;i++)
		{
			ary[i]=sc.nextInt();
		}
		int num4=0;
		
		for(int i=0;i<num1;i++)
		{
			for(int j=i+1;j<num1;j++)
			{
				for(int b=j+1;b<num1;b++)
				{
					if(ary[i]+ary[j]+ary[b]<=num2)
					{
						if(ary[i]+ary[j]+ary[b]>=num4)
						{
							num4=ary[i]+ary[j]+ary[b];
						}
					}
				}
			}
		}
		System.out.println(num4);

	}

}
