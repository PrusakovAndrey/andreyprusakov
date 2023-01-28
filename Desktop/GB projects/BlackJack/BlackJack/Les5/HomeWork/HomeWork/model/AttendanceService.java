package HomeWork.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AttendanceService implements Iterable<Student>{
    private static List<Student> studentsGroup = new ArrayList<>();

    public static void addStudent(Student student) {
        studentsGroup.add(student);
    }

    public static void addStudent(String name) {
        studentsGroup.add(new Student(name));
    }

    public static int getSize() {
        return studentsGroup.size();
    }

    public static Student getStudent(int index) {
        return studentsGroup.get(index);
    }

    public static List<Student> getAllStudents() {
        return studentsGroup;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroup();
    }

    @Override
    public String toString() {

        return studentsGroup.toString();
    }

    
}