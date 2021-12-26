package com.coding.java8.functionalInterfaces;

import com.coding.java8.data.Student;
import com.coding.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(s->{
            if(PredicateExample.p1.test(s)){
                studentGradeMap.put(s.getName(),s.getGpa());
            }
        });
        return studentGradeMap;
    });
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(studentFunction.apply(studentList));
    }
}
