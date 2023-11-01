public class SkywardStudent{
    private int grade; 
    private int attendance;
    private int classes;

    // constructor?
    public SkywardStudent(){
        classes = 0;
        int[][] student = new int[3][2];
    }

    // print options + get user input
    public void options() {
		// call class
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

        // switch statement here?
	}
    
    public void enrollStudent(int classID) {
        Student [classes][0] = classID;
        classes++;
    }
    
    public void changeGrade (int grade, int classID){
        int var1;
        for(int var2=0; var2<classes;var2++){
            if(student[var2][0]==classID){
                var1=var2;
            }
        }
        student[var1][2]=grade;
    }
    
    public void changeAttendance (int attendance, int classID){
        int var1;
        for(int var2=0; var2<classes;var2++){
            if(student[var2][0]==classID){
                var1=var2;
            }
        }
        student[var1][1]=attendance;
    }
    
    
}
