package com.kiranacademy.logical;

public class ArrayPair {
	public static void main(String[] args) {

		int[]a={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10 ;j++){
				if(a[j]==(a[i]*a[i])){
					System.out.println(a[i]+" "+a[j]);
					break;
				}
			}
		}
	}
}