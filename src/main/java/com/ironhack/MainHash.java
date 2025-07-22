package com.ironhack;

import java.util.HashMap;
import java.util.Map;

public class MainHash {
    public static void main(String[] args) {

        Student student1 = new Student("Mari Carmen", 50);
        Student student2 = new Student("Josan", 50);
        Student student3 = new Student("Paco", 50);
        Student student4 = new Student("Anastasia", 50);



        Map<String, Student> grades = new HashMap<>();
        grades.put("Mari Carmen", student1);
        grades.put("Josan", student2);
        grades.put("Paco", student3);
        grades.put("Anastasia", student4);

//        System.out.println(grades);

        grades.forEach((name, student) -> System.out.println(name + ": " + student.getGrade()));
        increaseGrades(grades);
        grades.forEach((name, student) -> System.out.println(name + ": " + student.getGrade()));
        increaseGrades(grades);
        grades.forEach((name, student) -> System.out.println(name + ": " + student.getGrade()));
        increaseGrades(grades);
        grades.forEach((name, student) -> System.out.println(name + ": " + student.getGrade()));
        increaseGrades(grades);
        grades.forEach((name, student) -> System.out.println(name + ": " + student.getGrade()));

    }
    public static Map<String, Student> increaseGrades(Map<String, Student> grades) {

        for (Student s : grades.values()) {
            int grade = s.getGrade();
            int plus = (int) (grade * 0.10);
            int gradePlus = grade + plus;
            s.setGrade(gradePlus);
        }
        return grades;
    }
    }
