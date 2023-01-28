import java.time.LocalDate;

import HomeWork.model.Student;
import HomeWork.model.AttendanceService;
import HomeWork.viewer.*;

public class Main {
    public static void main(String[] args) {

        {
            Student Jhon = new Student("Jhon");
            Jhon.addVisitMark(LocalDate.of(2023, 1,1), true);
            Jhon.addVisitMark(LocalDate.of(2023, 1, 2), true);
            Jhon.addVisitMark(LocalDate.of(2023, 1, 3), true);
            Jhon.addVisitMark(LocalDate.of(2023, 1, 4), true);
            Jhon.addVisitMark(LocalDate.of(2023, 1, 5), true);
            Student Mark = new Student("Mark");
            Mark.addVisitMark(LocalDate.of(2023, 1, 1), false);
            Mark.addVisitMark(LocalDate.of(2023, 1, 2), false);
            Mark.addVisitMark(LocalDate.of(2023, 1, 3), false);
            Mark.addVisitMark(LocalDate.of(2023, 1,4), false);
            Mark.addVisitMark(LocalDate.of(2023, 1,5), false);
            Student Will = new Student("Will");
            Will.addVisitMark(LocalDate.of(2023, 1, 1), false);
            Will.addVisitMark(LocalDate.of(2023, 1, 2), false);
            Will.addVisitMark(LocalDate.of(2023, 1, 3), false);
            Will.addVisitMark(LocalDate.of(2023, 1, 4), true);
            Will.addVisitMark(LocalDate.of(2023, 1, 5), true);
            Student Ivan = new Student("Ivan");
            Ivan.addVisitMark(LocalDate.of(2000, 1, 1), false);
            Ivan.addVisitMark(LocalDate.of(2000, 1, 2), true);
            Ivan.addVisitMark(LocalDate.of(2000, 1, 3), true);
            Ivan.addVisitMark(LocalDate.of(2000, 1, 4), true);
            Ivan.addVisitMark(LocalDate.of(2000, 1, 5), true);
            AttendanceService.addStudent(Jhon);
            AttendanceService.addStudent(Mark);
            AttendanceService.addStudent(Will);
            AttendanceService.addStudent(Ivan);
            }

            Viewer.getMenu();
    }    
}
