package ds_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		   System.out.print("Enter array size: ");
		   int sizee=sc.nextInt();
		   int[] arr=new int[sizee];
		   for(int i=0;i<sizee;i++) {
			   System.out.print("Enter Element "+(i)+": ");
			   arr[i]=sc.nextInt();
		   }
		   InsertionSort.insertionSort(arr);
		   printArray(arr);
		   */
		sc.close();
	
		   long startTime,endTime;
		   Random rand=new Random();
		   int size=50000;
		   int[] array=new int[size];
		   for(int i=0;i<size;i++) {
			  array[i]=rand.nextInt(Integer.MAX_VALUE);
		   }
			startTime = System.nanoTime();
			HeapSort.heapSort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Heap Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s"); 
			startTime = System.nanoTime();
			QuickSort.quickSort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Quick Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s"); 
			startTime = System.nanoTime();
			MergeSort.mergeSort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Merge Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s"); 
			startTime = System.nanoTime();
			InsertionSort.insertionSort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Insertion Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s"); 
			startTime = System.nanoTime();
			SelectionSort.selectionSort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Selection Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s");
			startTime = System.nanoTime();
		    BubbleSort.bubblesort(array.clone());
			endTime = System.nanoTime();
			System.out.println("Bubble Sort: "+(endTime - startTime)*Math.pow(10, -9) + " s"); 
	}
	public static void printArray(int [] arr ) {
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void swap(int[] x, int i, int j) {
		int temp=x[i];
		x[i]=x[j];
		x[j]=temp;
		
	}

}
