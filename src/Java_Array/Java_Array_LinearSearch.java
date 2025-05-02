package Java_Array;

public class Java_Array_LinearSearch {

	public static void main(String[] args) {
		
		
		//Search an element in an array(linear search)
		
		int a[]= {10, 34, 11, 25, 56};
		int searchElement=110;
		boolean status=false;
				
		for(int i=0;i<a.length; i++)
		{
			
			if(a[i]==searchElement)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
			
		}
		
		if(status==false)
		{
			System.out.println("Element Not Found");
		}
	
		
		
		

	}

}
