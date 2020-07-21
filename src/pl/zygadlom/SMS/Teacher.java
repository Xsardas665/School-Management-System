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
    /**
     * @return the id.
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }
    /**
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }
    /**
     * set the salary.
     * @param salary of the teacher.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
