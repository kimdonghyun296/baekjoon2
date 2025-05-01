package q1254;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		sc.close();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(isp(str.substring(i)))
			{
				break;
			}
			count++;
			
		}
		System.out.println(str.length()+count);
		
	}

public static boolean isp(String str)
{
	
	for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
	{
		if(str.charAt(i)!=str.charAt(j))
		{
			return false;
		}
	}
	return true;
}
}


