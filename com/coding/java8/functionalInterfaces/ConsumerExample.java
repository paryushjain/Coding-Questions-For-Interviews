package com.coding.java8.functionalInterfaces;

import com.coding.java8.data.Student;
import com.coding.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer2 = System.out::println;
    static Consumer<Student> studentName = s -> System.out.print(s.getName()+" ");
    static Consumer<Student> studentActivities = s -> System.out.println(s.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("dexter");
        //printName();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    static void printName(){
        studentList.forEach(consumer2);
    }

    static void printNameAndActivities(){
        studentList.forEach(studentName.andThen(studentActivities));
    }

    static void printNameAndActivitiesUsingCondition(){
        studentList.forEach((s)->{
            if(s.getGradeLevel()>=3){
                studentName.accept(s);
            }
        });
        System.out.println("");
        studentList.stream().filter(s->s.getGradeLevel()>=3).forEach(studentName);
    }

}
