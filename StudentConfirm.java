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


public class SkywardStudent{
    private int classes;
    public int[][] student;
    
    public int choice;
    
    private int[] courses = new int[5];

    // constructor that also initializes the array for the student
    public SkywardStudent(){ //All of the methods are public by default, but as of now they are not static. Is that a purposeful choice?
        classes = 0;
        int[][] student = new int[3][2];
    }

    
    public void enrollStudent(int classID) {
        student[classes][0] = classID;
        classes++;
    }
    
    public void changeGrade (int grade, int classID){
        int var1=0;
        for(int var2=0; var2<classes;var2++){ //What does this do? --Will  //for loop to match inputted class ID with a row in the student's array -Neev 
            if(student[var2][0]==classID){
                var1=var2;
            }
        }
        student[var1][2]=grade;
    }
    
    public void changeAttendance (int attendance, int classID){
        int var1=0; //Why not declare var1 in the class as opposed to declaring it in a method? //I mean we could but it might get mixed up with the other var1 in the other method. I mean this should work but if you want to make it better go for it -Neev
        for(int var2=0; var2<classes;var2++){
            if(student[var2][0]==classID){
                var1=var2;
            }
        }
        student[var1][1]=attendance;
    }
    
    
}
