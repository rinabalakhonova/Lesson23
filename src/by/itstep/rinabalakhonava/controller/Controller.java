package by.itstep.rinabalakhonava.controller;

import by.itstep.rinabalakhonava.model.data.Student;
import by.itstep.rinabalakhonava.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {
        Student student = new Student(name: "Alex", age:20, mark:10, alive:true);
        Student student = new Student(name: "Alex", age:20, mark:9, alive:true);
        Student student = new Student(name: "Alex", age:20, mark:10, alive:true);

        Student[] students = {student1, student2, student3};

        double result = Manager.calculateAvgStudentMark(students);


    }

}
