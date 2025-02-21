package q11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int[] ary1=new int[num1];
		int[] ary2=new int[num1];
		for(int i=0;i<num1;i++)
		{
			ary1[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(ary1);
		
		int sum=0;
		for(int i=0;i<num1;i++)
		{
			ary2[i]=sum+ary1[i];
			sum+=ary1[i];
		}
		int sum1=0;
		for(int i=0;i<num1;i++)
		{
			sum1+=ary2[i];
		}
		System.out.print(sum1);

	}

}
