package com.kiranacademy.logical;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int []a={40,60,20,50};

		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){

				if(a[i]>a[j]){

					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}

