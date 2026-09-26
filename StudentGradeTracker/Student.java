package StudentGradeTracker;

public class Student 
{
    private String name;
    private int grade;
    private boolean passed;

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade");
        } else {
            this.grade = grade;
        }
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

