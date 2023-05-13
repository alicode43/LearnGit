package arr;

public class arrangeNumber {
	public static void main(String []args) {
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,14 };
		int size=intArray.length;
	
		
			if(size%2==0) {
				int j=1;
				for(j=0; j<=size-1;j=j+2) {
					
					System.out.print(intArray[j]+"    ");
				}

				for(int l=size-1; l>=0;l=l-2) {
					System.out.print(intArray[l]+"   ");
						
				}
			}
			else {
				int j=1;
				for(j=0; j<=size-1;j=j+2) {
					
					System.out.print(intArray[j]+" ");
				}

				for(int l=size-2; l>=0;l=l-2) {
					System.out.print(intArray[l]+" ");
						
				}
				
			}
			
		
	}

}
