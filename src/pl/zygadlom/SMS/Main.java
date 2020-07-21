package pl.zygadlom.SMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String cmd;
    private static List<Teacher> teacherList;
    private static List<Student> studentList;
    public static void main(String[] args) {
        Teacher tTokio = new Teacher(1, "Tokio", 500);
        Teacher tDenver = new Teacher(2, "Denver", 700);
        Teacher tMoscow = new Teacher(3, "Moscow", 1200);
        Teacher tBerlin = new Teacher(4, "Berlin", 2300);

        teacherList = new ArrayList<>();
        teacherList.add(tTokio);
        teacherList.add(tDenver);
        teacherList.add(tMoscow);
        teacherList.add(tBerlin);

        Student sPalermo = new Student(1, "Palermo", 1);
        Student sRio = new Student(2, "Rio", 0);
        Student sHelsinki = new Student(3, "Helsinki", 1);
        Student sStockholm = new Student(4, "Stockholm", 1);
        Student sNairobi = new Student(5, "Nairobi", 1);
        Student sOslo = new Student(6, "Oslo", 1);

        studentList = new ArrayList<>();
        studentList.add(sPalermo);
        studentList.add(sRio);
        studentList.add(sHelsinki);
        studentList.add(sStockholm);
        studentList.add(sNairobi);
        studentList.add(sOslo);

        School school = new School(teacherList, studentList);
        System.out.println("School has earned $" + school.getTotalMoneyEarned());
        System.out.println("School has spent $" + school.getTotalMoneySpent());
        System.out.println("School Balance $" + school.getSchoolBalance());

        Scanner input = new Scanner(System.in);
        while(true) {
            cmd = input.nextLine();
            cmd = cmd.toLowerCase();
            if (cmd.equals("end")) {
                break;
            } else {
                parsecommand();
                school.printSchoolState();
            }
        }
    }

    private static void parsecommand() {
        String[] params = cmd.split(" ");
        if (params[0].equals("student")) {
            int id = Integer.parseInt(params[1]);
            if (params[2].equals("paid")) {
                int value = Integer.parseInt(params[3]);
                studentList.get(id - 1).payFees(value);
            } else {
                System.out.println("Something went Wrong.");
            }
        }else{
            System.out.println("Unknown Command.");
        }
    }
}
