package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How high should the sieve go up to?: ");
		int n = in.nextInt();
		
		boolean[] sieve = new boolean[n];
		
		for(int i=2; i<n; i++) {
			if(sieve[i]==false) {
				for(int j= 2*i; j<n; j+=i) {
					sieve[j] = true;
				}
			}
		}
		
		for(int k=2; k<n; k++) {
			if(sieve[k]==false) {
				System.out.print(k + ", ");
			}
		}
	}

}
