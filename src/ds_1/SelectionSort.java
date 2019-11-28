package ds_1;

public class SelectionSort {
	public static void selectionSort(int Arr[])
	{
		int i=0;
		int min=0;
		int j;
		for(i=0;i<Arr.length-1;i++)
		{
			min=i;
			
	     for(j=i+1;j<Arr.length;j++)
		{
			if(Arr[j]<Arr[min]) 
			{
				min=j;
			}
		}
		if(min!=i)
		Main.swap(Arr, i, min);
	    }
		
	}
}
