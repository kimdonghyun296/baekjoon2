package q1920;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		//시간초과 코드 set자료구조 이용해야함
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		 List<Integer> list = new ArrayList<>();

		for(int i=0;i<num1;i++)
		{
			list.add(sc.nextInt());
		}
		int num2=sc.nextInt();
	
		
		
		
		for(int i=0;i<num2;i++)
		{
			if(list.contains(sc.nextInt()))
			{
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		sc.close();
		
		
		
	}

}
