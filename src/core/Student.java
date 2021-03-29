package core;

import java.util.Objects;

public class Student {
    private int age;
    private final String name;
    private int studentId;

    public Student(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.studentId = id;
    }

    public int getID() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
}