package q10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		sc.close();
		
		int num2=str.length()-1;
		
		int num3=0;
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(num2--))
			{
				num3=1;
			}
		}
		
		if(num3==1)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}

	}
	
}
