package q1427;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		
		int[] ary=new int[str.length()]; 
		
		for(int i=0;i<str.length();i++)
		{
			ary[i]=str.charAt(i)-'0';
		}
		
		
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			{
				if(ary[i]<=ary[j])
				{
					int temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			}
		}
		
		for(int i=0;i<ary.length;i++)
		{
			System.out.printf("%d",ary[i]);
		}
		

	}

}
