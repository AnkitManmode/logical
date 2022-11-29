package com.kiranacademy.arraylogical;

import java.util.Arrays;

public class FrequencyRange4 {

	public static void main(String[] args) {
				
		int[] a= {1,5,3,2,8,6,7,4,11,10};
		
		// 1-4  count1
		// 5-8  count2
		// 9-12 count3
			
		int count1=0,count2=0,count3=0;
		
	//	String[] strings= {"1324","5867","1110"};
		StringBuffer[] s= {new StringBuffer() ,new StringBuffer(),new StringBuffer()};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=1 && a[i]<=4)
			{
				s[0].append(a[i]+",");
				count1++;
			}
			else if(a[i]>=5 && a[i]<=8)
			{
				s[1].append(a[i]+",");
				count2++;
			}
			else
			{
				s[2].append(a[i]+",");
				count3++;
			}
		}
		
// int[] a= {1,5,3,2,8,6,7,4,11,10};
		System.out.println(s[0]+ " and count is " + count1);;
		System.out.println(s[1] + " and count is  " + count2);;
		System.out.println(s[2] + " and count is  " + count3);;	
			
		
		
	}
}
