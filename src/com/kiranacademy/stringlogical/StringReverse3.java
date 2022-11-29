package com.kiranacademy.stringlogical;

/* program to print string in reverse order , print only odd positioned characters */

public class StringReverse3 {

	public static void main(String[] args) {
				
		String s="Java";
			
		//   [j][a][v][a]
		//    0  1  2  3
	
		for(int index=s.length()-1;index>=0;index--)
		{
			if(index%2==1)
				System.out.println(s.charAt(index));
		}
		
		StringBuffer sb = new StringBuffer("java");
		sb.reverse();
		System.out.println(sb);
		
	}

}
