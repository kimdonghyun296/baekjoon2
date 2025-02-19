package q18870;

import java.util.*;


public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int[] ary1=new int[num1];
		int[] ary2=new int[num1];
		for(int i=0;i<ary1.length;i++)
		{
			ary1[i]=sc.nextInt();
			ary2[i]=ary1[i];
		}
		sc.close();
		for(int i=0;i<ary1.length;i++)
		{
			ary2[i]=ary1[i];
		}
		Arrays.sort(ary2);
		
		
		
		HashMap<Integer, Integer> rank = new HashMap<>();
		int rank1=0;

		for(int i=0;i<num1;i++)
		{
			if(!rank.containsKey(ary2[i]))
			{
				rank.put(ary2[i], rank1++);
			}
		}
		
		for(int i=0;i<num1;i++)
		{
			System.out.printf("%d ", rank.get(ary1[i]));
		}
	}
}
