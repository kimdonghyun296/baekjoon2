package q10870;

import java.util.Scanner;

public class Main {
	public static long pab(long a)
	{
		if(a==0) {
			return a;
		}
		else if(a==1)
		{
			return a;
		}
		else
		{
			return pab(a-2)+pab(a-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(pab(sc.nextLong()));
		sc.close();

	}

}
