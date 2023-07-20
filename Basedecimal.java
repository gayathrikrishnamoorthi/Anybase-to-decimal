package sample;

import java.util.Scanner;

public class Basedecimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		while(i<4) {
			int b=a%10;
			sum+=b*Math.pow(n, i);
			a=a/10;
			
			i++;
			
		}System.out.println(sum);
		

	}

}


