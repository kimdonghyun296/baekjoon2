package q28278;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int[] ary=new int[num1];
		int count=-1;
		int[] ary2=new int[100000];
		
		for(int i=0;i<num1;i++)
		{
			ary[i]=sc.nextInt();
			if(ary[i]==1)
			{
				ary2[++count]=sc.nextInt();
			}
			else if(ary[i]==2)
			{
				if(count>=0)
				{
					System.out.println(ary2[count]);
					count--;
				}
				else
				{
					System.out.println(-1);
				}
			}
			else if(ary[i]==3)
			{
				System.out.println(count+1);
			}
			else if(ary[i]==4)
			{
				if(count==-1)
				{
					System.out.println(1);
				}
				else
				{
					System.out.println(0);
				}
			}
			else if(ary[i]==5){
				if(count>=0)
				{
					
					System.out.println(ary2[count]);
					
				}
				else {
					System.out.println(-1);
				}
			}
		}
	}

}
