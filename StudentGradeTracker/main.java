package StudentGradeTracker;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alex");
        student1.setGrade(85);

        System.out.println(student1.getName());
        System.out.println(student1.getGrade());
        student1.calculatePassStatus();
    }
}