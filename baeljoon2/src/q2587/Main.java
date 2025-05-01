package q2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[5];
		int avg=0;
		
		for(int i=0;i<5;i++)
		{
			ary[i]=sc.nextInt();
			avg+=ary[i];
		}
		sc.close();
		Arrays.sort(ary);
		System.out.println(avg/5);
		System.out.println(ary[2]);
		
	}

}
