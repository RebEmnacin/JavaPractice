package StudentGradeTracker;

public class Student 
{
    private String name;
    private int grade;
    private boolean passed;

    public Student(String name, int grade) {
    this.name = name;
    setGrade(grade); 
    calculatePassStatus();
}

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void calculatePassStatus() {
        if (grade >= 75) {
            passed = true;
            System.out.println("Student has passed");
        } else {
            passed = false;
            System.out.println("Student has not passed");
        }
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

