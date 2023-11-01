import java.util.Scanner;
import java.util.ArrayList;
public class SkywardMain {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		int studenttotal=0;
		ArrayList<String> Students = new ArrayList<String>();
		
		int choice;
		do {
		
	    System.out.println("====================Skyward=====================");    
		for(int i=1; i<studenttotal; i++){
		    System.out.println("\t" + Students.get(i));
		    
		}    
		    
		// pring out options
		System.out.println("1. Add a student");
		System.out.println("2. Enroll a student");
		System.out.println("3. Assign course");
		System.out.println("4. Assign grade");
		System.out.println("5. Edit Attendance");
		System.out.println("6. Create a Class");
		System.out.println("7. Exit");
		System.out.print("Choose an option: ");
		// user input
		int choice = reader.nextInt();

        // switch statement here?
	    switch(choice){
		    case 1:
		    	System.out.println("Enter the student's name");
		    	String name = reader.nextLine();
		    	Students.add(name);
//		    	SkywardStudent studenttotal  = new SkywardStudent();
		    	studenttotal++;
		    	break;
		    case 2:
			   System.out.println("Type the class ID: ");
			   int id = reader.nextInt();
			   break; 
		    case 3:
		        break;
		    case 4:
		        break;
		    case 5:
		        break;
		    case 6:
		        break;
		    case 7:
		        System.exit(0);
		        break;
	    }
	    System.out.flush(); 
	    }
	    while (choice != 5);
	}

}
