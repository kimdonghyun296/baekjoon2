package q1316;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[] ary=new String[num];
		int sum=0;
		for(int i=0;i<num;i++)
		{
			ary[i]=sc.next();
		}
		sc.close();
		for(int i=0;i<num;i++)
		{
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		boolean a=true;
			for(int j=0;j<ary[i].length();j++)
			{
				if(!map.containsKey(ary[i].charAt(j)))
				{
					map.put(ary[i].charAt(j),j);
				}
				else
				{
				      if(map.get(ary[i].charAt(j))+1==j)
					{
						map.put(ary[i].charAt(j),j);

					}
					else
		    		{
						a=false;
					}
				}
			}
			if(a==true)
			{
				sum++;
			}
		}
		
		
		System.out.println(sum);
	}
}
