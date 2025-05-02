package JavaPackage_Basics;

public class Java_DataTyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* float p, r, si ;
		 int n ;
		 p = 1000.50f ;
		 n = 3 ;
		 r = 15.5f ;
		 si = p * n * r / 100 ;
		 System.out.println ( si ) ;*/

	
		 //Overriding values
			/*
			 * int a=100;; System.out.println(a);
			 * 
			 * a=200; System.out.println(a);
			 */
		 
		 //Approach 1 - If all variables belong to different data type
			/*
			 * int a=100; //declaration +assignment 
			 * int b=200; 
			 * int c=300;
			 */
		 
		 //Approach2 - If all variables belong to same data type
			/*
			 * int a,b,c; //declaration 
			 * a=100; //assignment 
			 * b=200; 
			 * c=300;
			 */
		 
		 //Approach 3 - If all variables belong to same data type
		 	int a=100, b=200, c=300;
		 
		 System.out.println("The value of a is:" +a); //+ = Concatenation of Strings 
		 System.out.println("The value of b is:" +b);
		 System.out.println("The value of c is:" +c);
		 
		 System.out.println(a+b+c);//It will output total as a, b,c are integers
		 System.out.println(a+" " +b+ " " +c);//Need to perform string operation by adding spaces to display values
		 
		 
		 char name ='A';
		 System.out.println(name);
		 String name1 ="A";
		 System.out.println(name1);
		 
			/* char name ="A"; *///not valid
		 
		 
	}
	
	

}
