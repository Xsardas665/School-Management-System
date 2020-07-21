package pl.zygadlom.SMS;

/**
 * Class responsible for keeping track of Students status.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesRemaining;
    private int feesTotal;

    /**
     * To create a new Student via Initiation.
     * Fees for every student is $50,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique;
     * @param name name of the student;
     * @param grade grade of the student;
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 50000;
        feesRemaining = feesTotal - feesPaid;
    }

    /**
     * Used to update student's grade.
     * @param grade new grade of student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Adding fees to feesPaid field.
     * Add the fees to the fees paid;
     * Subtract fees from the remainingFees.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
        feesRemaining -= fees;
    }
}
