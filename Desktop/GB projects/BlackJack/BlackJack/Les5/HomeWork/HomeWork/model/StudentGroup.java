package HomeWork.model;

import java.util.Iterator;

public class StudentGroup implements Iterator<Student>{
    private int index = -1;

    @Override
    public boolean hasNext(){
        return index < AttendanceService.getSize()-1;
    }
    
    @Override
    public Student next() {
        return AttendanceService.getStudent(++index);
    }

    
}
