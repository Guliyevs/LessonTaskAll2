package general_task_for_oop.task5;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getFinalGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
