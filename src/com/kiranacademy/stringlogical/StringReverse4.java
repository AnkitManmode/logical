package com.kiranacademy.stringlogical;

import java.util.Arrays;

/* program to print string in reverse order , print only odd positioned characters */

public class StringReverse4 {

	public static void main(String[] args) {
				
		String s="java";
			
		char[] ch=s.toCharArray();
		
		int size=ch.length;
		int i=0,j=size-1;// temp=i
		
		//   0  1  2  3  4
		//  [n][a][r][i][k]
		
		for(i=0 , j=size-1 ; i<size/2 ; i++ , j--)
		{
				char temp;
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
		}
			
		System.out.println(Arrays.toString(ch));
	    s=new String(ch);
		
		System.out.println(s);
	}

}
