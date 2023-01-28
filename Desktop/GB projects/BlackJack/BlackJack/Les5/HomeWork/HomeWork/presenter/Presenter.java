package HomeWork.presenter;
import java.util.Collections;

import HomeWork.model.*;;

public class Presenter {
    public static String dataProcessing(String menyChoice) {
        switch (menyChoice) {
            
            case "1":
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < AttendanceService.getSize(); i++) {
                    int markTrue = 0;
                    int percentMarkTrue = 0;
                    temp.append(AttendanceService.getStudent(i).getName());
                    temp.append("\tPercent of attendance = ");
                    for (Boolean mark : AttendanceService.getStudent(i).getAttendanceLog().values()) {
                        if (mark) {
                            markTrue++;
                        }
                    }
                    percentMarkTrue = markTrue * 100
                            / AttendanceService.getStudent(i).getAttendanceLog().values().size();
                    temp.append(percentMarkTrue);
                    temp.append(" %.\n");
                }
                return temp.toString();

            
            case "2":
                Collections.sort(AttendanceService.getAllStudents(), new ComparatorStudents());
                StringBuilder temp1 = new StringBuilder();
                for (int i = 0; i < AttendanceService.getSize(); i++) {
                    int markTrue = 0;
                    int percentMarkTrue = 0;
                    temp1.append(AttendanceService.getStudent(i).getName());
                    temp1.append("\tPercent of attendance = ");
                    for (Boolean mark : AttendanceService.getStudent(i).getAttendanceLog().values()) {
                        if (mark) {
                            markTrue++;
                        }
                    }
                    percentMarkTrue = markTrue * 100
                            / AttendanceService.getStudent(i).getAttendanceLog().values().size();
                    temp1.append(percentMarkTrue);
                    temp1.append(" %.\n");
                }
                return temp1.toString();

            
            case "3":
                StringBuilder temp2 = new StringBuilder();
                for (int i = 0; i < AttendanceService.getSize(); i++) {
                    int markTrue = 0;
                    int percentMarkTrue = 0;
                    for (Boolean mark : AttendanceService.getStudent(i).getAttendanceLog().values()) {
                        if (mark) {
                            markTrue++;
                        }
                    }
                    percentMarkTrue = markTrue * 100
                            / AttendanceService.getStudent(i).getAttendanceLog().values().size();
                    if (percentMarkTrue < 50) {
                        temp2.append(AttendanceService.getStudent(i).getName());
                        temp2.append("\tPercent of attendance = ");
                        temp2.append(percentMarkTrue);
                        temp2.append(" %.\n");
                    }

                }
                return temp2.toString();

            default:
                return "Your choose wrong point";

        }
    }
}
