public class GradeCalculator {

    public double calculateAverageGrade(double[] grades) {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public void displayGradeReport(Student student) {
        System.out.println("Grade Report for " + student.getName() + ":");
        student.displayStudentInfo();
    }
}
