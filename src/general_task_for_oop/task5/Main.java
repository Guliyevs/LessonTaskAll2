package general_task_for_oop.task5;

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Emin", 65);
        GraduateStudent graduateStudent = new GraduateStudent("Ali", 70);

        System.out.println("Undergraduate Student Final Grade: " + undergraduateStudent.getFinalGrade());
        System.out.println("Graduate Student Grade: " + graduateStudent.getGrade());
        System.out.println("Graduate Student Final Grade: " + graduateStudent.getFinalGrade());
    }
}
