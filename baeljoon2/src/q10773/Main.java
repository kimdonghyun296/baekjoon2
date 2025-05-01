package q10773;

import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		Stack<Integer> st=new Stack<Integer>();
		
	
		
		for(int i=0;i<num1;i++)
		{
			int num2=sc.nextInt();
			if(num2==0)
			{
				st.pop();
			}
			else {
				st.push(num2);
			}
		}
		sc.close();
		int sum=0;
		while(!st.isEmpty())
		{
			sum+=st.pop();
		}
		System.out.println(sum);
	}

}
