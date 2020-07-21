package pl.zygadlom.SMS;

/**
 * Class responsible for keeping track of Teachers status.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher object.
     * @param id id of teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
