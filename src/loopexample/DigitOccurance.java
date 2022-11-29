package loopexample;

import java.util.Arrays;

public class DigitOccurance {

	public static void main(String[] args) {
		
		int no=100312,index;
		
		int[] a=new int[10];
		
		while(no!=0)
		{
			index=no%10;
			a[index]=a[index]+1;
			no=no/10;
		}
			
		System.out.println(Arrays.toString(a));
		
		if(a[0]!=0)
			System.out.println("0 " + " has appeared " + a[0] + " times ");
		
		for(int i=1;i<a.length;i++)
		{
					if(a[i]!=0)
				System.out.println(i+" has appeared " + a[i]+" times");
		}

	}

}
