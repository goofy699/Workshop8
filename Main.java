import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Student info from user
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double[] grades = new double[numSubjects];
        System.out.println("Enter grades: ");
        for (int i = 0; i < numSubjects; i++) {
            grades[i] = scanner.nextDouble();
        }

        // Create Student object
        Student student = new Student(name, age, grades);
        
        // Create GradeCalculator object and display the report
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.displayGradeReport(student);

        scanner.close();
    }
}
