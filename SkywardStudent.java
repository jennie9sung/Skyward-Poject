import java.util.Scanner;

/*public class Student{
  //make variables
  //make constructor
  // in the constructor, make a 3x4 array, witht the three collumns being classes, attendace, and grades, and thw 4 rows being empty data for classes
  
  //make 3 methods, all of which change the array of the student
  //change grade - choose what class to change and use that to naviagte the array.
  //change attendance - same thing as change array
  //add class - unnullify a row of the student's array by assigning a value and assign it to a class ID
 * 
 */


public class SkywardStudent {
	public int ID;
	
	public void AddClass() {
		
	}
	
	public void AddStudent() {
		
	}

	public void AssignClass() {
	
	}
	
	public void AssignGrade() {
		
	}
	public void EditAttendance() {
		
	}
	
	public void options() {
		// call class
		SkywardStudent stu = new SkywardStudent();
		Scanner reader = new Scanner(System.in);
		
		// pring out options
		System.out.println("1. Add class");
		System.out.println("2. Add student");
		System.out.println("3. Assign class");
		System.out.println("4. Assign grade");
		System.out.println("5. Edit Attendance");
		System.out.println("");
		System.out.print("Choose an option: ");
		// user input
		int choice = reader.nextInt();
		
		
		
	}
	
	
}

