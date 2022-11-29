package com.kiranacademy.logical;

public class PrimeFactors {
	public static void main(String[] args) {

		int num=12;
		for(int i=1;i<=num;i++){
			//if factor is prime then only print it
			if(num%i==0 && PrimeNumbersMethod.isPrime(i)){
				System.out.println(i);
			}
		}
	}
}