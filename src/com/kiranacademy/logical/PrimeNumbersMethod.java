package com.kiranacademy.logical;

public class PrimeNumbersMethod {
	public static void main(String[] args) {

		for(int no=1;no<=300;no++){

			boolean ans=isPrime(no);
			if(ans)
				System.out.println(no);
		}
	} 
	static boolean isPrime(int no){

		int i;
		for(i=2;i<no;i++){

			if(no%i==0)
				break;
		}
		if(no==i)
			return true;
		else
			return false;

	}
}

