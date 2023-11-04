import java.util.Scanner;
import java.util.ArrayList;
public class SkywardMain {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		int studenttotal=0;
		int classtotal =0;
		ArrayList<String> Students = new ArrayList<String>();
		ArrayList<String> Classes = new ArrayList<String>();
		int choice;
		SkywardStudent school = new SkywardStudent();
		do {
		System.out.println("");
	    System.out.println("====================Skyward=====================");    
		for(int i=0; i<studenttotal; i++){
		    System.out.println("\t" + (i+1) + ". " + Students.get(i));
		    int c = school.getClasstotal(i);
		    for(int k = 0; k<c; k++){ 
		        System.out.print("\t\t" + Classes.get(k));
		        //print out grade then attendace for class k
		        System.out.print("(Grade: " + school.getGrade(i,k) + ", Attendace: " + school.getAttendance(i,k) + ")");
		    }
		    System.out.println("");
		}    
		
		System.out.println("\n------------------------------------------------");
		for(int i=0; i<classtotal; i++){
		    System.out.println("\t" + (i+1) + ". " + Classes.get(i));
		}    
		
		
		
		System.out.println("================================================");    
		// print out options
		System.out.println("1. Add a student");
		System.out.println("2. Enroll a student in a class");
		System.out.println("3. Assign grade to a student's class");
		System.out.println("4. Edit a student's Attendance");
		System.out.println("5. Create a Class");
		System.out.println("6. Exit");
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
		        System.out.print("Enter the student's ID:");
		        studentID=reader.nextInt()-1;
		        System.out.print("Enter the class's ID: ");
		        classID=reader.nextInt();
                System.out.print("Enter the percent grade you would like to change to: ");	
                int grade = reader.nextInt();
                school.changeGrade(studentID, grade, classID);
		        break;
		    case 4:
		        System.out.print("Enter the student's ID:");
		        studentID=reader.nextInt()-1;
		        System.out.print("Enter the class's ID: ");
		        classID=reader.nextInt();
                System.out.print("Enter the number of tardys the student has in this class:");	
                int attendance = reader.nextInt();
                school.changeAttendance(studentID, attendance, classID);
		        break;
		    case 5:
		        System.out.println("Enter the class's name: ");
		    	String classname = reader.next();
		    	Classes.add(classname);
		    	classtotal++;
		    	break;
		    case 6:
		        System.exit(0);
		        break;
	    }
	    System.out.print("\033[H\033[2J"); 
	    System.out.flush();
	    }
	    while (choice != 5);
	}

}
