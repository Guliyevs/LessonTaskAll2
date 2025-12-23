package general_task_for_oop.task5;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int grade) {
        super(name, grade);
    }

    @Override
    public int getFinalGrade() {
        return getGrade() + 15;
    }
}
