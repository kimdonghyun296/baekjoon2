package q15894;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long num1=sc.nextInt();
		sc.close();
		long num2=num1+1;
		double num3=((num1-1)*0.5)*2;
		long num4=num1*2;
		long sum=num2+(long)num3+num4;		
		System.out.printf("%d", sum);
	}
}
