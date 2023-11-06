import java.util.Scanner;
import java.util.ArrayList;

public class SkywardStudent {
    private int[][][] school; // 3D array to store student information: [studentID][classIndex][0:classID, 1:grade, 2:attendance]
    ArrayList<Integer> StudentClassTotal = new ArrayList<>();

    // Constructor to initialize the class properties and the school array
    public SkywardStudent() {
        // Initializing the school array with dimensions [10][10][3] for 10 students, 10 classes per student, and 3 data points (classID, grade, attendance)
        school = new int[10][10][3];
    }

    // Method to add a new class for a student when they are enrolled
    public void giveBirth(){
        StudentClassTotal.add(0);
    }

    // Method to get the total number of classes for a specific student
    public int getClasstotal(int studentID){
        return StudentClassTotal.get(studentID);
    }

    // Method to enroll a student in a class
    public void enrollStudent(int studentID, int classID) {
        // Storing the classID in the school array for the specified student and class index
        school[studentID][getClasstotal(studentID)][0] = classID;
        // Incrementing the total number of classes for the student
        int x = StudentClassTotal.get(studentID) + 1;
        StudentClassTotal.set(studentID, x);
    }

    // Method to change the grade for a specific class of a student
    public void changeGrade(int studentID, int grade, int classID) {
        // Updating the grade for the specified student and class
        school[studentID][classID][1] = grade;
    }

    // Method to change the attendance for a specific class of a student
    public void changeAttendance(int studentID, int attendance, int classID) {
        // Updating the attendance for the specified student and class
        school[studentID][classID][2] = attendance;
    }

    // Method to get the attendance for a specific class of a student
    public int getAttendance(int studentID, int classID) {
        return school[studentID][classID][2]; // Returning the attendance for that class
    }
    
    // Method to get the grade for a specific class of a student
    public int getGrade(int studentID, int classID) {
        return school[studentID][classID][1]; // Returning the grade for that class
    }
    
    // Method to get the class ID for a specific class of a student
    public int getClassID(int studentID, int classIndex){
        return school[studentID][classIndex][0]; // Returning the class ID for that class index
    }
}
