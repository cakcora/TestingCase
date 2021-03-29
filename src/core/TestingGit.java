package core;

import java.util.HashSet;
import java.util.Hashtable;

public class TestingGit {
    public static void main(String[] args) {
        int age =30;
        var students = new Hashtable<>();
        Student cuneyt = new Student(35,"cuneyt",5);
        students.put(cuneyt.getID(),cuneyt);

        Student john = new Student(24,"john",6);
        students.put(john.getID(),john);

        var studentSet=new HashSet<Student>();
        studentSet.add(cuneyt);
        studentSet.add(john);

        var stmap = new Hashtable<Integer,Student>(15000);

    }
}
