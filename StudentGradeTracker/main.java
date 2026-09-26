package StudentGradeTracker;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alex");
        student1.setGrade(90);

        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());

    }
    
}
