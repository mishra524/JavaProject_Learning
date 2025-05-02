package JavaPackage_Basics;

import java.util.Scanner;

public class Java_ControlStatements {

	public static void main(String[] args)
	{
		
			int age=25;
			
			if(age>=18)
			   {
					System.out.println("Eligible for vote");
			   }
			else
			   {
				    System.out.println("Not Eligible for vote");
			   }
			
			
			
			int no=4;
			if(no%2==0)
				{
					System.out.println("Even No");
				}
			else
				{
					System.out.println("Odd No");
				}
			
				/*
				 * If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and
				 * DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500,
				 * then HRA = Rs. 1500 and DA = 98% of basic salary. If the employee's salary is
				 * input through the keyboard write a program to find his gross salary.
				 */
			
			System.out.println("Enter basic salary");
			Scanner scn=new Scanner(System.in);
			float bs= scn.nextFloat();
			float hra=0, da=0;
			if(bs<1500)
			{
				hra = bs * 10 / 100 ; 
				 da = bs * 90 / 100 ;
			}
			
			if(bs>=1500)
			{
				hra = 1500 ; 
				 da = bs * 98 / 100 ;
				
			}
			
			float gs= (bs+hra+da);
			System.out.println("Gross Salary: " +gs);
			
     }
	
}