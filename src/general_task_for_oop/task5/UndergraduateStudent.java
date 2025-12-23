package general_task_for_oop.task5;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, int grade) {
        super(name, grade);
    }

    @Override
    public int getFinalGrade() {
        return getGrade();
    }
}
