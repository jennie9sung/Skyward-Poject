import java.util.Scanner;
import java.util.ArrayList;

public class SkywardStudent {
    private int classes; // Variable to track the number of classes a student is enrolled in
    private int students; // Variable to track the number of students (currently not used)
    private int[][][] school; // 3D array to store student information: [studentID][classIndex][0:classID, 1:grade, 2:attendance]
    ArrayList<Integer> StudentClassTotal = new ArrayList<>();


    // Constructor to initialize the class properties and the school array
    public SkywardStudent() {
        classes = 0;
        students = 0;
        // Initializing the school array with dimensions [10][3][2] for 10 students, 3 classes per student, and 2 data points (classID, grade, attendance)
        school = new int[10][3][2];
    }

    public void giveBirth(){
        StudentClassTotal.add(0);
    }

    public int getClasstotal(int studentID){
        return StudentClassTotal.get(studentID);
    }

    // Method to enroll a student in a class
    public void enrollStudent(int studentID, int classID) {
        school[studentID][getClasstotal(studentID)][0] = classID; // Storing the classID in the school array
        int x = StudentClassTotal.get(studentID)+1;
        StudentClassTotal.set(studentID, x);
    }

    // Method to change the grade for a specific class of a student
    public void changeGrade(int studentID, int grade, int classID) {
        for (int i = 0; i < StudentClassTotal.get(studentID); i++) {
            if (school[studentID][i][0] == classID) { // Finding the class with the given classID for the student
                school[studentID][i][1] = grade; // Updating the grade for that class
                return;
            }
        }
    }

    // Method to change the attendance for a specific class of a student
    public void changeAttendance(int studentID, int attendance, int classID) {
        for (int i = 0; i < StudentClassTotal.get(studentID); i++) {
            if (school[studentID][i][0] == classID) { // Finding the class with the given classID for the student
                school[studentID][i][2] = attendance; // Updating the attendance for that class
                return;
            }
        }
    }



//old method below, please disregard -Neev 

//    // Method to get the total number of classes a student is enrolled in
//    public int getClasstotal(int studentID) {
//        int classtotal = 0; // Variable to store the total number of classes
//        for (int i = 0; i < 3; i++) { // Looping through the classes (maximum 3)
//            if (school[studentID][i][0] != 0) { // Checking if the classID is not zero (indicating a valid class)
//                classtotal++; // Incrementing the total classes count
//            }
//        }
//        return classtotal; // Returning the total number of classes the student is enrolled in
//    }
    
    public int getAttendance(int studentID, int classID) {
        for (int i = 0; i < StudentClassTotal.get(studentID); i++) {
            if (school[studentID][i][0] == classID) { // Finding the class with the given classID for the student
                return school[studentID][i][2]; // Returning the attendance for that class
            }
        }
        return 0;
    }
    
    // Method to get the grade for a specific class of a student
    public int getGrade(int studentID, int classID) {
        for (int i = 0; i < StudentClassTotal.get(studentID); i++) {
            if (school[studentID][i][0] == classID) { // Finding the class with the given classID for the student
                return school[studentID][i][1]; // Returning the grade for that class
            }
        }
        return 0;
    }
    
    public int getClassID(int studentID, int k){
        return school[studentID][k][0];
    }
    
}
