package moveZero;

import java.util.Arrays;
import java.util.Scanner;

public class Zeros {
	public static int[] movezeros(int ar[],int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(ar[i]!=0) {
				ar[count++]=ar[i];
				
			}
			
		}
		while(count<n) {
			ar[count++]=0;
		}
		return ar;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int[] ar1=movezeros(ar,n);
		System.out.println(Arrays.toString(ar1));

	}

}
