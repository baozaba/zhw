import java.util.Scanner;  
  
public class main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        student student = null;  
  
        while (true) {  
            System.out.print("Please enter a student ID:(or give quit to stop it): ");  
            String inputId = scanner.nextLine();  
            if (inputId.equalsIgnoreCase("quit")) {  
                break;  
            }  
  
            System.out.print("Please enter a student name: ");  
            String name = scanner.nextLine();  
  
            System.out.print("Please enter the number of the extra activities: ");  
            int numActivities = scanner.nextInt();  
            scanner.nextLine(); 
            student = new student(inputId, name, numActivities);  
  
            for (int i = 0; i < numActivities; i++) {  
                System.out.print("Please give the " + (i + 1) + " extra activities: ");  
                String activity = scanner.nextLine();  
                student.addActivity(i, activity);  
            }  
  
            System.out.println(student);   
        }  
  
        scanner.close();  
    }  
}