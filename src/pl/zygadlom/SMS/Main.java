package pl.zygadlom.SMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
        school.printSchoolState();

        Scanner input = new Scanner(System.in);
        while(true) {
            String cmd = input.nextLine();
            cmd = cmd.toLowerCase();
            if (cmd.equals("end")) {
                break;
            } else {
                parsecommand(cmd);
                school.printSchoolState();
            }
        }
    }

    private static void parsecommand(String cmd) {
        String[] params = cmd.split(" ");
        if (params[0].equals("student")) {
            int id = Integer.parseInt(params[1]);
            if (params[2].equals("paid")) {
                int value = Integer.parseInt(params[3]);
                studentList.get(id - 1).payFees(value);
                System.out.println(studentList.get(id - 1).getName() + " paid $" + value + " of fees.");
            } else if (params[2].equals("info")) {
                Student student = studentList.get(id-1);
                System.out.println(student.getName() + " | " + student.getGrade() + " | $" + student.getFeesRemaining() + " left");
            } else {
                System.out.println("Something went Wrong.");
            }
        } else if (params[0].equals("teacher")) {
            int id = Integer.parseInt(params[1]);
            if (params[2].equals("bonus")){
                int value = Integer.parseInt(params[3]);
                teacherList.get(id - 1).updateBalance(value);
                System.out.println(teacherList.get(id - 1).getName() + " get $" + value + " of bonus.");
            } else if (params[2].equals("info")){
                Teacher teacher = teacherList.get(id-1);
                System.out.println(teacher.getName() + " | $" + teacher.getSalary());
            }
        } else {
                System.out.println("Unknown Command.");
        }
    }
}
