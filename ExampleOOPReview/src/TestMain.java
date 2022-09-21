import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();
//		System.out.println("Computer ID: " + c1.getId());
//		Computer c2 = new Computer("12345", false, 2020);
//		System.out.println("Year: " + c2.getUpdateYear());
//		
//		// Print out current year
//		int year = Computer.CURRENT_YEAR;
//		System.out.println("Current year: " + year);
//		
//		System.out.println(c2);
//		
//		Computer c3 = c2;
//		c3.setUpdateYear(1995);
//		System.out.println(c2);
//		
//		// Checking for equality
//		Computer c4 = new Computer("12345", false, 1995);
//		System.out.println("c1: ");
//		System.out.println(c1);
//		System.out.println("c2: ");
//		System.out.println(c2);
//		System.out.println("c3: ");
//		System.out.println(c3);
//		System.out.println("c4: ");
//		System.out.println(c4);
//		
//		System.out.println("c1 == c2: " + (c1 == c2));
//		System.out.println("c1 == c2: " + (c2 == c4));
//		System.out.println("c1 == c2: " + (c2 == c3));
		
		// Creating Lab Computer Objects
	/*	LabComputer lc1 = new LabComputer();
		LabComputer lc2 = new LabComputer("55555", true, 2010, "PV 105");
		System.out.println(lc1);
		System.out.println(lc1);
		
		// Polymorphism
		Computer c1 = new LabComputer();
		BudgetItem b1 = new LabComputer();
		c1 = new FacultyComputer();  */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the id: ");
		try
		{
		String newId = input.next();
		System.out.println("Enter in the update year: ");
		int updateYear = input.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Year must be a number");
		}	
		
		try {
			Computer c = new LabComputer();
			//c = new LabComputer("11111", true, 1995, "PV 105");
			c = new LabComputer("3245A", true, 2015, "PV 105");
			System.out.println(c);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			Computer c1 = new LabComputer();
			// To avoid null pointer Exception
			// Check if not equal to null before calling methods
			if (c1 != null && c1.getId().compareTo("99999") > 0)
				System.out.println("c1 is greater than 99999");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
