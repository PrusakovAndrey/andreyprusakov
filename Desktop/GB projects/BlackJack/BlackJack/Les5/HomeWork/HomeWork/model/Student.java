package HomeWork.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Student{
    private String name;
    private Map<LocalDate, Boolean> visits = new HashMap<>();


    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Имя - %s", name);
    }
    public String getName() {
        return name;
    }

    public Map<LocalDate, Boolean> getAttendanceLog() {
        return visits;
    }

    public void addVisitMark(LocalDate date, Boolean mark) {
        visits.put(date, mark);
    }
}