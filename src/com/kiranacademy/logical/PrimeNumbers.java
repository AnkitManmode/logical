package com.kiranacademy.logical;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		for(int no=1;no<=300;no++){
			int i;
			for(i=2;i<no;i++){
				if(no%i==0){
					System.out.println("no is not prime==>" +no);
					break;
				}
			}
			if(no==i)
				System.out.println("no is prime==>" +no);

		}
	}
}
