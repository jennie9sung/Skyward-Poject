import java.util.Scanner;
import java.util.ArrayList;
public class SkywardMain {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		int studenttotal=0;
		int classnum =0;
		ArrayList<String> Students = new ArrayList<String>();
		ArrayList<String> Classes = new ArrayList<String>();
		int choice;
		SkywardStudent school = new SkywardStudent();
		do {
		System.out.println("");
	    System.out.println("====================Skyward=====================");    
		for(int i=0; i<studenttotal; i++){
			// this one's to check variable values --> remove this part later
//			System.out.println(studenttotal+"  "+classnum);
			
		    System.out.print("\t" + (i+1) + ". " + Students.get(i));
		    if (classnum>0&&i<classnum) {
		    	System.out.println("    " + Classes.get(i));
		    }
		    System.out.println("");
		    
		}    
		System.out.println("\n------------------------------------------------");    
		// print out options
		System.out.println("1. Add a student");
		System.out.println("2. Enroll a student");
		System.out.println("3. Assign course to a student"); // is assign course adding new courses?(Jennifer)
		System.out.println("4. Assign grade to a student's class");
		System.out.println("5. Edit a student's Attendance");
		System.out.println("6. Create a Class");
		System.out.println("7. Exit");
		System.out.print("Choose an option: ");
		// user input
	    choice = reader.nextInt();

        // switch statement here?
	    switch(choice){
		    case 1:
		    	System.out.println("Enter the student's name: ");
		    	String name = reader.next();
		    	Students.add(name);
		    	studenttotal++;
		    	break;
		    case 2:
		       System.out.print("Enter the student's ID:");
		       int studentID=reader.nextInt()-1;
		       System.out.print("Enter the class's ID: ");
		       int classID=reader.nextInt();
		       school.enrollStudent(studentID,classID);
			   break; 
		    case 3:
		    	// assign class to a certain student (id given when add new student)
		    	// worked when I tested
		    	System.out.println("Enter the class name: ");
				   String classname = reader.next();
				   System.out.println("Enter the Student ID: ");
				   int id = reader.nextInt();
				   Classes.set(id-1, classname);
				   classnum++;
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
	    System. out. print("\033[H\033[2J"); // what is this doing? I thought it was clearing smt (Jennifer)
	    }
	    while (choice != 5);
	}

}
