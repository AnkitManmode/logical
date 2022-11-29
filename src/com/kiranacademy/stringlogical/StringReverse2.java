package com.kiranacademy.stringlogical;

/* program to print string in reverse order , print only odd positioned characters */

public class StringReverse2 {

	public static void main(String[] args) {
				
		String s="Java";
		
		char[] ch=s.toCharArray();
				
		//ch [j][a][v][a]
		//    0  1  2  3
	
		for(int index=ch.length-1;index>=0;index--)
		{
			if(index%2==1)
				System.out.println(ch[index]);
		}
	}

}
