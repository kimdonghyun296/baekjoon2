package q3052;

import java.util.Scanner;
import java.util.*;


	public class Main{
		public static void main(String[] args) {
			int ary1[]=new int[10];

			Scanner sc=new Scanner(System.in);
			for(int i=0;i<10;i++)
			{
				ary1[i]=sc.nextInt();
			}
			sc.close();
			for(int i=0;i<10;i++)
			{
				ary1[i]=ary1[i]%42;
			}
			 Arrays.sort(ary1);
	 
			 /*for(int i=0;i<10;i++)
			 {
				 System.out.println(ary1[i]);
			 }*/
			

		    int c = 1;
		      for (int i = 1; i < 10; i++) {   
		         if (ary1[i] - ary1[i - 1] != 0) c++;   
		      }
			System.out.println(c);
		}
		
	}
