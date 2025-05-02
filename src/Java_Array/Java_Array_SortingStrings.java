package Java_Array;

import java.util.Arrays;

public class Java_Array_SortingStrings {

	public static void main(String[] args) {
	
		char s[]= {'A', 'C', 'D', 'B'};
		System.out.println("Character Array: Before Sorting...");
		
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);//sort the character array
		
		System.out.println("Character Array: After Sorting...");
		System.out.println(Arrays.toString(s));
		
		String n[]= {"john", "scott", "grey", "pop"};
		
		System.out.println("String Array: Before Sorting...");
		System.out.println(Arrays.toString(n));
		
		Arrays.sort(n);
		
		System.out.println("String Array: After Sorting...");
		System.out.println(Arrays.toString(n));
		

	}

}
