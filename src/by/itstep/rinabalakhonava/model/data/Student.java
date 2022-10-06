package by.itstep.rinabalakhonava.model.data;

//entity-class
public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

//    default constructor
    public Student(){
        name = "Chris";
        age = 21;
        mark = 6;
        alive = true;

    }

//    constructor with params
    public Student(String n, int a, double m, boolean al) {
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

//    cope-constructor
    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
                alive = student.alive;
    }

    public String getInfo(){
        return name
                + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");

    }
}
