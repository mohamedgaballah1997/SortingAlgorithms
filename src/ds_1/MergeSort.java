package ds_1;


public class MergeSort {
	public static void mergeSort(int[] a) {
		sort(a,0,a.length-1);
		
	}
	
public static void sort(int[] a,int p,int r) {
	if(r>p) {
	int q=(p+r)/2;
	sort(a, p, q);
	sort(a, q+1, r);
	merge(a, p, q, r);
	}
	
}
public static void merge(int[] a,int p,int q,int r) {
	int n1=q-p+1;
	int n2=r-q;
	int [] left=new int[n1];
	int [] right=new int[n2];
	for(int i=0;i<n1;i++)
		left[i]=a[p+i];
	for(int i=0;i<n2;i++)
		right[i]=a[q+i+1];
	int i=0;
	int j=0;
	int k=p;
	while(i<n1 && j<n2) {
		if(left[i]<=right[j])
			
			a[k]=left[i++];
		else
			a[k]=right[j++];
		
		k++;
	}
    while (i < n1) 
    { 
        a[k] = left[i]; 
        i++; 
        k++; 
    } 
  
    while (j < n2) 
    { 
        a[k] = right[j]; 
        j++; 
        k++; 
    } 
	
	
}
}
