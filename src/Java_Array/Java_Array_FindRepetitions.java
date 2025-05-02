package Java_Array;

public class Java_Array_FindRepetitions {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,10,10};
		int num=10;
		int count=0;
		int i;
		
		for(i= 0; i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
