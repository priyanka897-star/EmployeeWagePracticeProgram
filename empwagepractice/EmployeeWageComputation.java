package empwagepractice;

public class EmployeeWageComputation {
	
		public static void main(String[] args) {
			
		//Constants
		 final int IS_FULL_Time = 1;
		//Computation
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_Time) 
		{
			System.out.println("Employee is Present");
		}	
		else
		{
			System.out.println("Employee is Absent");
	    }
 }	
}
