package com.kiranacademy.stringlogical;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java";
		
		char[] ch=s.toCharArray();
		
		//[j][a][v][a]
		// 0  1  2  3
		
		for(int index=ch.length-1;index>=0;index--)
		{
			System.out.println(ch[index]);
		}
		
		System.out.println(s);
	}

}
