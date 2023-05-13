package arr;

import java.util.Scanner;

public class ArrayList {

		
		 public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int[][] arr=new int[n][0]; 
		        for(int i=0;i<n;i++){
		           
		        	int d=s.nextInt();
		        	int[][] newArr=new int[n][d];
		        	 arr=newArr; 
		            for(int j=0;j<d;j++){
		             arr[i][j]=s.nextInt();   
		             
		            }
		          }
		        
//		        for(int i=0;i<n;i++){
//		            // int x=s.nextInt();
//		            // int y=s.nextInt();
//		          
//		           
//		            for(int j=0;j<d;j++){
//		             arr[i][j]=s.nextInt();   
//		             System.out.print(arr[i][j]);
//		            }
//		         }
		        
		        
		        
		        
		    }
		}
