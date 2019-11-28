package ds_1;

public class HeapSort {
	
	public static int getMax(int[] arr,int parent,int left,int right) {
		int max=parent;
		if(left<=arr[0] && arr[max]<arr[left])
			max=left;
		if(right<= arr[0] && arr[max]<arr[right])
			max=right;
		return max;
				
		}

	public static void heapify(int[] arr,int index) {
		int left=2*index;
		int right=left+1;
		int max=getMax(arr, index, left, right);
		if(max!=index) {
			Main.swap(arr, max, index);
			heapify(arr, max);
		}
		
	}
	
	public static void heapSort(int[] array) {
		int size=array.length-1;
		array[0]=size;
   for(int i=array[0]/2;i>0;i--) {
		  heapify(array, i);
   }
   for(int i=array[0];i>=2;i--) {
	   int temp=array[1];
	   array[1]=array[i];
	   array[i]=temp;
	   array[0]--;
	   heapify(array, 1);
	   
   }
   array[0]=size;

}
}
