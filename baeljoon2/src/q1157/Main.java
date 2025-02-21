package q1157;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.next();
		sc.close();
		int[] ary=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)>=97)
				{
					if(str.charAt(i)==str.charAt(j)||str.charAt(i)==(str.charAt(j)+32))
					{
						count++;
					}
				}
				else {
					if(str.charAt(i)==str.charAt(j)||str.charAt(i)==(str.charAt(j)-32))
					{
						count++;
					}
				}
			}
			
			ary[i]=count;
		}
		
		HashMap<Integer,Character> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			map.put(ary[i],str.charAt(i));
		}
		int num3=str.length()-1;
		Arrays.sort(ary,0,str.length());
		if(ary[str.length()-1]==ary[str.length()-2])
		{
			System.out.println("?");
			
		}
		else {
			char upperChar = Character.toUpperCase(map.get(ary[num3]));
			System.out.println(upperChar);
		}
		
	}

}
