package q2745;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int num1=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)>=65)
			{
				sum=sum+(str.charAt(i)-55)*(int)Math.pow(num1,str.length()-i-1);
			}
			else
			{
				sum+=(str.charAt(i)-'0')*(int)Math.pow(num1,str.length()-i-1);
			}
		}
		System.out.println(sum);
	}
}
