package q10815;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int[] ary=new int[num1];
		for(int i=0;i<num1;i++)
		{
			ary[i]=sc.nextInt();
		}
		int num2=sc.nextInt();
		int[] ary2=new int[num2];
		for(int i=0;i<num2;i++)
		{
			ary2[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<num2;i++)
		{
			int count=0;
			for(int j=0;j<num1;j++)
			{
				if(ary2[i]==ary[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.printf("%d ",1);
			}
			else
			{
				System.out.printf("%d ",0);
			}
		}
	}
}
