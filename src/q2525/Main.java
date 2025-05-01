package q2525;

import java.util.Scanner;

public class Main {

	   public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      
	      int num1=sc.nextInt();
	      int num2=sc.nextInt();
	      int num3=sc.nextInt();
	      sc.close();
	      
	      int num4=(num1*60)+(num2+num3);
	      
	      
	      int num5=num4/60;
	      int num6=num4%60;
	      
	      int num7=num5/24;
	      int num8=num5%24;
	      
	      if(num7>=1)
	      {
	    	  num1=num8;
	      }
	      else
	      {
	    	  num1=num5;
	      }
	      
	      
	      System.out.printf("%d %d",num1,num6);
	   }

	}
