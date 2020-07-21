package pl.zygadlom.SMS;

/**
 * Class responsible for keeping track of Students status.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student
     * @param id id for the student: unique;
     * @param name name of the student;
     * @param grade grade of the student;
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
