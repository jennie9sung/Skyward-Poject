import java.util.Scanner;
public class SkywardStudent{
    private int classes;
    private int students;
    public int[][][] school;
    
    public int choice;
    
    private int[] courses = new int[5];

    // constructor that also initializes the array for the student
    public SkywardStudent(){ //All of the methods are public by default, but as of now they are not static. Is that a purposeful choice?
        classes = 0;
        students=0;
        int[][][] school = new int[10][3][2];
    }

    public void givebirth(int studentID){
        
    }
    
    public void enrollStudent(int studentID, int classID) {
        school[studentID][classes][0] = classID;
        classes++;
    }
    
    public void changeGrade (int studentID, int grade, int classID){
        int var1=0;
        for(int var2=0; var2<classes;var2++){ //What does this do? --Will  //for loop to match inputted class ID with a row in the student's array -Neev 
            if(school[studentID][var2][0]==classID){
                var1=var2;
            }
        }
        school[studentID][var1][2]=grade;
    }
    
    public void changeAttendance (int studentID, int attendance, int classID){
        int var1=0; //Why not declare var1 in the class as opposed to declaring it in a method? //I mean we could but it might get mixed up with the other var1 in the other method. I mean this should work but if you want to make it better go for it -Neev
        for(int var2=0; var2<classes;var2++){
            if(school[studentID][var2][0]==classID){
                var1=var2;
            }
        school[studentID][var1][1]=attendance;
        }
    }
}
    
