package ds_1;

public class InsertionSort {
	public static void insertionSort(int Arr[])
	{
		int key,i;
		
		for (int j=1;j<Arr.length;j++)
		{
			key=Arr[j];
			i=j-1;
			while (i>=0 && Arr[i]>key)
			{
				Arr[i+1]=Arr[i];
				i=i-1;
			}
			Arr[i+1]=key;
		}
		
	}

}
