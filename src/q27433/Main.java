package q27433;

import java.util.Scanner;

public class Main {
	
	public static long pac(long a)
	{
		if(a<=1)
		{
			return 1;
		}
		else {
			return a*pac(a-1);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(pac(sc.nextInt()));
		sc.close();

	}

}
