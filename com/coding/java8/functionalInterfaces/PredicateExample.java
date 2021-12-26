package com.coding.java8.functionalInterfaces;

import com.coding.java8.data.Student;
import com.coding.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        filterStudentByGradeLevel(studentList);
    }

    private static void filterStudentByGradeLevel(List<Student> studentList) {
        studentList.forEach(s -> {
                    if (p1.test(s)) {
                        System.out.println(s.getName());
                    }
                });
    }
}
