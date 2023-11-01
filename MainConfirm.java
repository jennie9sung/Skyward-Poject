import java.util.Arrays;
import java.util.Scanner;

public class SkywardMain {

	public static void main(String[] args) {
		SkywardStudent stu = new SkywardStudent();
		options();

	}
	
	public static void options() {
		// call class
		SkywardStudent stu = new SkywardStudent();
		
		Scanner reader = new Scanner(System.in);
		
		// pring out options
		System.out.println("1. Add a student");
		System.out.println("2. Enroll a student");
		System.out.println("3. Assign course");
		System.out.println("4. Assign grade");
		System.out.println("5. Edit Attendance");
		System.out.println("");
		System.out.print("Choose an option: ");
		// user input
		int choice = reader.nextInt();

        // switch statement here?
	    switch(choice){
		    case 1:
//		    	if (courses[5]!=0) {
//			   System.out.print("Course name: "); 
//			   String course = reader.next();
//			   System.out.println("");
//			   for (int n=0;n<5;n++) {
//				   if ()
//			   }
//		    	}else {
//		    		System.out.println("You reached the maximum number of courses.");
//		    		options();
//		    	}
		    	System.out.println("?");
		    	options();
		    	break;
		    case 2:
			   System.out.println("Type the class ID: ");
			   int id = reader.nextInt();
			   stu.enrollStudent(id);
			   System.out.print(stu.student[1][1]);
			   options();
	    }
	}

}
