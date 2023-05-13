package arr;

import java.util.Scanner;

public class ArraySwap {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		 int  input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i=i+2) {
			if(i<size) {
			System.out.print(input[i+1]+" ");
		}
			System.out.print(input[i]+" ");
			
	}
		
		if(size%2!=0) {
			System.out.print(input[size-1]);
		}
	}

}
