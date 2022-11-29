package com.kiranacademy.arraylogical;

public class FrequencyRange {

	public static void main(String[] args) {
		
		
		int[] a= {1,5,3,2,8,7,4,11};
		
		// 1-4  count1
		// 5-8  count2
		// 9-12 count3
		
		int count1=0,count2=0,count3=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=1 && a[i]<=4)
				count1++;
			else if(a[i]>=5 && a[i]<=8)
				count2++;
			else
				count3++;
		}
		
		System.out.println("1-4 count is " + count1);
		System.out.println("5-8 count is " + count2);
		System.out.println("9-12 count is " + count3);
		
		
		
	}
}
