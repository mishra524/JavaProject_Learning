package Java_Array;

import java.util.Arrays;

public class Java_Array_SortingElements {

	public static void main(String[] args) {

		
		int a[]= {100,200,600,300,500};
		
		System.out.println("Before Sorting....");
		for(int i=0; i<a.length;i++)
		{
			//Before Sorting
			
			System.out.println(a[i]);
		}

		
		//Alternate method to Print all Array Elements before sorting, using inbuilt method.
		
		//System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //sort elements in array
		
		System.out.println("After Sorting....");
		
		for(int i=0; i<a.length;i++)
		{
			//Before Sorting
			
			System.out.println(a[i]);
		}
		
		//System.out.println(Arrays.toString(a));
		
	}

}
