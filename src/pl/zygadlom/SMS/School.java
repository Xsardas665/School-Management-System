package pl.zygadlom.SMS;

import java.util.List;

/**
 * School Class that manage students and techers via List.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New school Object.
     * @param teachers list of teachers in school.
     * @param students list of students in school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param teacher add teacher to list of school teachers.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return list of students in school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students set the list of students in school.
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * @return the total amount of money earned by school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @param totalMoneyEarned set the
     */
    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
