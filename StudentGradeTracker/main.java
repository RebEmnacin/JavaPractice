package StudentGradeTracker;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 85);
        System.out.println(student1.getName() + " - " + student1.getGrade() + " - Passed: " + student1.isPassed() + "\n");

        Student student2 = new Student("Jamie", 500);
        System.out.println(student2.getName() + " - " + student2.getGrade() + " - Passed: " + student2.isPassed());
    }
}