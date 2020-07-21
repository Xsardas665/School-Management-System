package pl.zygadlom.SMS;

import java.util.List;

/**
 * School Class that manage students and teachers via List.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private static int schoolBalance;
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
     * @param student add student to list of school students.
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * @return the total amount of money earned by school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * @param moneyEarned value of transaction to add to totalMoneyEarned.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
        updateSchoolbalance();
    }
    /**
     * @return the total amount of money spent by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * @param moneySpent value of transaction made by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
        updateSchoolbalance();
    }
    /**
     * @return the school current balance.
     */
    public int getSchoolBalance() {
        return schoolBalance;
    }
    /**
     * method that udates the school current balance.
     */
    public static void updateSchoolbalance() {
        schoolBalance = totalMoneyEarned - totalMoneySpent;
    }
    /**
     * Method that prints state of school finances
     */
    public void printSchoolState() {
        System.out.println("School has earned $" + totalMoneyEarned);
        System.out.println("School has spent  $" + totalMoneySpent);
        System.out.println("School Balance    $" + schoolBalance);
    }
}
