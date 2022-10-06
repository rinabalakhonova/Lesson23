package by.itstep.rinabalakhonava.model.logic;

import by.itstep.rinabalakhonava.model.data.Student;

public class Manager {
    public static void calculateAvgStudentMark(Student[] students) {
        double s = 0;

        for (Student student : students) {
            s += student.mark;
        }

        return s / students.length;

    }
}
