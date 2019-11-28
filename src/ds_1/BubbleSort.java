package ds_1;


public class BubbleSort {

	 public static void bubblesort(int A[]) {
		   int i;
		   int j;
		   for(i=0;i<=A.length-1;i++) {
			   for(j=A.length-1;j>i;j--) {
				   if(A[j]<A[j-1])
				   {
					   Main.swap(A,j,j-1);
				   }
				   
			   }
		   }
			
		}

}
