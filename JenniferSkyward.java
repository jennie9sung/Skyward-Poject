import java.util.Scanner;

public class JenniferSkyward {

	public static void main(String[] args) {
		options();

	}
	public static void options() {
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
		
		
	}

}
