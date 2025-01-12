public class Student {
    private String name;
    private int age;
    private double[] grades;

    // Constructor
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
        return grades;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Names: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverageGrade());
        System.out.println();
    }
}
