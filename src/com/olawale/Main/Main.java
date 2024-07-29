//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.olawale.Main;

import com.olawale.School.School;
import com.olawale.Student.Student;
import com.olawale.Teacher.Teacher;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher olawale = new Teacher(1, "Olawale", 700);
        Teacher bola = new Teacher(2, "Bola", 500);
        Teacher musa = new Teacher(3, "Musa", 800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(olawale);
        teacherList.add(bola);
        teacherList.add(musa);


        Student ola = new Student(1, "Ola", 4);
        Student sola = new Student(2, "Sola", 3);
        Student fola = new Student(3, "Fola", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ola);
        studentList.add(sola);
        studentList.add(fola);

        School school = new School(teacherList, studentList);

        Teacher tolu = new Teacher(4, "Tolu", 900);
        school.addTeacher(tolu);

        ola.payFees(5000);
        sola.payFees(4000);
        System.out.println("School account has earned $" + school.getTotalMoneyEarned());

        System.out.println("------ Payment For Teacher Salary -------");

        olawale.receiveSalary(olawale.getSalary());

        musa.receiveSalary(musa.getSalary());

        bola.receiveSalary(bola.getSalary());

        System.out.println("Salary Payment To " + olawale.getName() + " And Remaining School Balance is $" + school.getTotalMoneyEarned());
        System.out.println();
        System.out.println("Salary Payment To " + musa.getName() + " And Remaining School Balance is $" + school.getTotalMoneyEarned());
        System.out.println();
        System.out.println("Salary Payment To " + bola.getName() + " And Remaining School Balance is $" + school.getTotalMoneyEarned());

        System.out.println(ola);
        System.out.println(bola);
        System.out.println(olawale);
        System.out.println(bola);
        System.out.println(tolu);

        }
    }

