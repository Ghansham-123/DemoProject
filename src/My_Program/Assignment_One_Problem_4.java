package My_Program;

public class Assignment_One_Problem_4 {
	public static void main(String[] args) {
		/*
		 4. Grade Assignment Based on Marks
Write a program that takes a student's marks as input and assigns a grade based on the 
following criteria:
Marks >= 90: Grade A
Marks >= 80: Grade B
Marks >= 70: Grade C
Marks >= 60: Grade D
Marks < 60: Fail
Use nested if-else statements to determine the grade.

		 */
		
		int marks=59;
		if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=80)
		{
			System.out.println("Grade B");
		}
		else if(marks>=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>=60)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}
}
