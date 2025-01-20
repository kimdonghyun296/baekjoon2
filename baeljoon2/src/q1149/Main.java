package q1149;

import java.util.*;
//배열1=입력값 배열2=누적치 저장하는 배열
//바로 직전 행의 최소값을 누적해서 더한다

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		int[][] house=new int[num1][3];
		int[][] house1=new int[num1][3];
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<3;j++)
			{
				house[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0;i<3;i++)
		{
			house1[0][i]=house[0][i];
		}
		for(int i=1;i<num1;i++)
		{
			house1[i][0]=house[i][0]+Math.min(house1[i-1][1], house1[i-1][2]);
			house1[i][1]=house[i][1]+Math.min(house1[i-1][0], house1[i-1][2]);
			house1[i][2]=house[i][2]+Math.min(house1[i-1][0], house1[i-1][1]);
		}
		int min=house1[num1-1][0];
		for(int i=1;i<3;i++)
		{
			if(house1[num1-1][i]<min)
			{
				min=house1[num1-1][i];
			}
		}

		System.out.println(min);

	}
}
