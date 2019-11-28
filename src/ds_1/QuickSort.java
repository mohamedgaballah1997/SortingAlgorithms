package ds_1;


public class QuickSort {
	
	public static void quickSort(int[] A) {
		
		int p=0;
		int r=A.length-1;
	    randQuick(A,p,r);
	}

	public static void randQuick(int A[],int p,int r)
	{
		int q;
		if(p<r) {
		    q=randomiz(A,p,r);
		    randQuick(A,p,q-1);
		    randQuick(A,q+1,r);
		}
	}
	
	public static int randomiz(int A[], int p, int r)
	{
		return partioning(A,p,r);
		
	}
	
	public static int partioning(int A[], int p, int r) {
		int i,j;
		int x=A[r];
	    i=p-1;
	    
	    for(j=p;j<r;j++)
	    {
	    	if  (A[j]<x)
	    	{	
		    i++;
		    
	    	Main.swap(A,i,j);
	    	}
	     
	    }
	    Main.swap(A,i+1,r);
		return i+1;
	}
}
