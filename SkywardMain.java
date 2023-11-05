import java.util.Scanner;
import java.util.ArrayList;

public class SkywardMain {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int studenttotal = 0;
        int classtotal = 0;
        int studentID;
        int classID;
        int error=0;
        ArrayList<String> Students = new ArrayList<>();
        ArrayList<String> Classes = new ArrayList<>();
        int choice;
        SkywardStudent school = new SkywardStudent();

        do {
            System.out.println("====================Skyward=====================");
            for (int i = 0; i < studenttotal; i++) {
                System.out.println("\t" + (i + 1) + ". " + Students.get(i));
                int numClasses = school.getClasstotal(i);
                for (int k = 0; k < numClasses; k++) {
                classID = school.getClassID(i, k);
                int grade = school.getGrade(i, classID);
                int attendance = school.getAttendance(i, classID);
                System.out.println("\t\t" + Classes.get(classID) + " (Grade: " + grade + ", Attendance: " + attendance + ")");
                }
                System.out.println(""); // Print a newline after each student's classes
            }
            

            System.out.println("\n------------------------------------------------");
            for (int i = 0; i < classtotal; i++) {
                System.out.println("\t" + (i + 1) + ". " + Classes.get(i));
            }

            System.out.println("================================================");
            
            switch (error){
                case 1:
                    System.out.println("No student exists.");
                    error=0;
                    break;
                case 2:
                    System.out.println("No class exists.");
                    error=0;
                    break;
            }

            // print out options
            System.out.println("");

            System.out.println("1. Add a student");
            System.out.println("2. Enroll a student in a class");
            System.out.println("3. Assign grade to a student's class");
            System.out.println("4. Edit a student's Attendance");
            System.out.println("5. Create a Class");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            // user input
            choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String name = reader.next();
                    Students.add(name);
                    studenttotal++;
                    break;
                case 2:
                	if (studenttotal==0) {
                		error =1;
                    } else if (classtotal==0){
                        error = 2;
                	}else {
                		System.out.print("Enter the student's ID:");
                		studentID = reader.nextInt() - 1;
                		System.out.print("Enter the class's ID: ");
                		classID = reader.nextInt() - 1;
                		school.enrollStudent(studentID, classID);
                        //SkywardStudent.schedule[studentID]++;
                	}
                    break;
                case 3:
                	if (studenttotal==0) {
                		error =1;
                    } else if (classtotal==0){
                        error = 2;
                	}else {
                		System.out.print("Enter the student's ID:");
                        studentID = reader.nextInt() - 1;
                        System.out.print("Enter the class's ID: ");
                        classID = reader.nextInt() - 1;
                        System.out.print("Enter the percent grade you would like to change to: ");
                        int grade = reader.nextInt();
                        school.changeGrade(studentID, grade, classID);
                	}
                    break;
                case 4:
                	if (studenttotal==0) {
                		error =1;
                    } else if (classtotal==0){
                        error = 2;
                	}else {
                		System.out.print("Enter the student's ID:");
                        studentID = reader.nextInt() - 1;
                        System.out.print("Enter the class's ID: ");
                        classID = reader.nextInt() - 1;
                        System.out.print("Enter the number of tardies the student has in this class:");
                        int attendance = reader.nextInt();
                        school.changeAttendance(studentID, attendance, classID);
                	}
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
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            clearConsole(); // Clear the console for a cleaner interface
        } while (choice != 6);
    }

    // Method to clear the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

