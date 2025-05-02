package JavaPackage_Basics;

public class Java_Operators {

	public static void main(String[] args) {
		
		
		/*
		 * int a =20; //a is an operand 
		 * int b=10; //b is an operand 
		 * int result = a+b;//
		 * + and = are Operators 
		 * System.out.println(result);
		 */

		//Arithmetic Operators
		
		/*
		 * System.out.println("Sum of a and b is: "+ (a+b)); //addition value
		 * System.out.println("DIfference of a and b is: "+ (a-b)); //subtract value
		 * System.out.println("Division of a and b is: "+ (a/b)); //quotient value
		 * System.out.println("Modulo division of a and b is: "+ (a%b)); //remainder
		 * value
		 * 
		 * 
		 * //Relational Operators or Comparison Operators //Always returns a boolean
		 * value - true or false //Work for only two variables
		 * 
		 * System.out.println(a>b); //true System.out.println(a<b); //false
		 * System.out.println(a>=b); //true System.out.println(a<=b); //false
		 * 
		 * b=20; //Now value of b has changed from 10 to 20 System.out.println(a<=b);
		 * //true System.out.println(a>=b); //true
		 * 
		 * 
		 * System.out.println(a!=b); //false System.out.println(a==b); //true
		 * 
		 * boolean res = a>b; //Another way to print by declaring a variable and then
		 * Printing System.out.println(res); //false
		 * 
		 * 
		 * //Logical Operators //Always returns boolean value - true or false //Works
		 * between 2 boolean values
		 * 
		 * 
		 * boolean x = true; boolean y = false; System.out.println(x && y); //false
		 * System.out.println(x||y); //true System.out.println(!x); //false
		 * System.out.println(!y); //true
		 * 
		 * 
		 * boolean b1= 10>20; System.out.println(b1); //false
		 * 
		 * boolean b2= 20>10; System.out.println(b2); //true
		 * 
		 * System.out.println(b1 && b2); //false System.out.println(b1 || b2); //true
		 * 
		 * //Combination of Relational and Logical Operators System.out.println(10<20 &&
		 * 20>10); //true System.out.println(10>20 && 20>10); //false
		 */		
		//Increment and Decrement Operators
		// ++ is called Increment operator
		/* Case1
		 * int a1=10; 
		 * System.out.println(a1);
		 * 
		 * a1++;// a1=a1+1; 
		 * System.out.println(a1);
		 */
		
		//Case2
		//Post Increment Operators - First assignment and then increment
		/*
		 * int a1 =10; 
		 * int result1=a1++; 
		 * System.out.println(result1); //10
		 * System.out.println(a1); //11
		 */
		
		//Case3
		//Pre Increment Operators - First increment and then assignment
		/*
		 * int a1=10; 
		 * int result1=++a1; 
		 * System.out.println(result1); //11
		 * System.out.println(a1); //11
		 */		
	
		//Pre and Post Decrement Operators
//		int a1=10;
//		a1--;
//		System.out.println(a1); //9
//		
//		int a2=100;
//		int result2= a2--;
//		System.out.println(result2); //100
//		System.out.println(a2); //99
//		
//		int a3=100;
//		int result3= --a3;
//		System.out.println(result3); //99
//		System.out.println(a3); //99
		
		
		//Assignment Operators
		/*
		 * int a =10; a+=5; //a=a+5 System.out.println(a);
		 * 
		 * a-=5; //a=a-5 System.out.println(a);
		 * 
		 * a*=2; //a=a*2 System.out.println(a);
		 * 
		 * a/=2; //a=a/2 System.out.println(a);
		 * 
		 * a%=2;//a=a%2 System.out.println(a);
		 */
		
		//Example1
		//Ternary Operators
		/*int a =200;
		int b= 100;
		
		int x= (a>b)?a:b;
		System.out.println(x); //200
		
		
		int x1= (a<b)?a:b;
		System.out.println(x1);*/ //100
		
		
		//Example2
		int x= (1==1)?100:200;
		System.out.println(x); //100
		
		int x1=(1==2)? 200:100;
		System.out.println(x1);//100
		
		//Example
		int person_age=30;
		String res=(person_age>18)?"Eligible":"NotEligible";
		System.out.println(res);	
				
		
		
		//Urinary Operators
		//++, --, +=, -=, *=
		//Binary Operators
		//+-/%><!=&&||
		//Ternary Operators
		//?:
		
		//Swapping of two numbers
		
		int a =10;
		int b= 20;
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
