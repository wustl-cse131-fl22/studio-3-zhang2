package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your n?");
		int n = in.nextInt();
		boolean[] prime= new boolean [n+1];
		
		for (int i = 2; i<=n; i++) {
			for(int x = 1; x<Math.sqrt(i); x++) {
				if (i%(x+1)==0) {
					prime[i]=true;
					break;}
			}}
		prime[1]=true;
		System.out.println(2);
		for (int i=1; i<prime.length; i++) {
			if (prime[i]==false) {
				System.out.println(i);
			
				
			}
		}
		
			}

	}
