package q25501;

import java.util.Scanner;

public class Main {
	static int count=0;
	public static int rec(String a,int l,int r)
	{
		
		count++;
		if(a.charAt(l)!=a.charAt(r))
		{
			return 0;
		}
		else if(l>=r){
			return 1;
		}
		else {
			return rec(a,l+1,r-1);
		}
		
	}
	
	public static int isp(String a)
	{
		count=0;
		
		return rec(a,0,a.length()-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		int[][] ary=new int[num1][2];
		
		for(int i=0;i<num1;i++)
		{
			ary[i][0]=isp(sc.next());
			ary[i][1]=count;
		}
		sc.close();
		
		for(int i=0;i<num1;i++)
		{
			System.out.println(ary[i][0]+" "+ary[i][1]);
		}
		
	}

}
