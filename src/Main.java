import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static  List<Student> studentList= new ArrayList<Student>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ;
        // TO DO: Create a Student List object that stores preloaded student objects
        // Student objects should be each student with info you collected

        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    createStudent(scanner);
                    break;
                case 2:
                    readStudents(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter student Id:");
        String studentId = scanner.nextLine();
        System.out.println("Enter grade: ");
        String grade= scanner.nextLine();
        System.out.println("Enter  jersey:");
        String jersey = scanner.nextLine();
        System.out.println("Enter  position: ");
        String position = scanner.nextLine();
        System.out.println("Enter cheer: ");
        String cheer = scanner.nextLine();
        System.out.println("Enter  subject: ");
        String subject = scanner.nextLine();
        System.out.println(" Is Jersey Color true/false: ");
        boolean IsJerseyColor = Boolean.parseBoolean(scanner.nextLine());
        System.out.println(" is Pitch Catch true/false: ");
        boolean PitchCatch = Boolean.parseBoolean(scanner.nextLine());

        Student student = new Student( id,grade,jersey,position, cheer,subject, IsJerseyColor, PitchCatch);
        studentList.add(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        if (studentList.isEmpty()) {
            System.out.println("There are no students in the database.");
        }else{
          for (Student student : studentList) {
              System.out.println(student);
          }
        }

    }

    private static void updateStudent(Scanner scanner) {
       System.out.print("Enter student ID: ");
       String id = scanner.nextLine();
       Student foundStudent= null;

       for (Student student : studentList) {
           if (student.getId().equals(id)) {
               foundStudent = student;
               break;
           }

       }
       if (foundStudent != null) {
           System.out.println("Enter student grade: ");
           foundStudent.setGrade(scanner.nextLine());
           System.out.println("Enter student jersey: ");
           foundStudent.setJersey(scanner.nextLine());
           System.out.println("Enter student position: ");
           foundStudent.setPosition(scanner.nextLine());
           System.out.println("Enter student cheer: ");
           foundStudent.setCheer(scanner.nextLine());
           System.out.println("Enter student subject: ");
           foundStudent.setSubject(scanner.nextLine());
           System.out.println(" Is Jersey Color true/false: ");
           foundStudent.setJerseyColor(Boolean.parseBoolean(scanner.nextLine()));
           System.out.println(" Is Pitch Catch true/false: ");
           foundStudent.setPitchCatch(Boolean.parseBoolean(scanner.nextLine()));

           System.out.println("Student updated successfully! ");
       }else{
           System.out.println("Student not found.");
       }
    }

    private static void deleteStudent(Scanner scanner) {
     System.out.print("Enter student ID to delete: ");
      String id = scanner.nextLine();
      boolean removed = studentList.removeIf(student -> student.getId().equals(id));

      if (removed) {
          System.out.println("Student deleted successfully!");

      }else{
          System.out.println("Student not found.");
      }
    }
}