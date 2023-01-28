package HomeWork.viewer;

import java.util.Scanner;
import HomeWork.presenter.*;

public class Viewer {
    
    public static void getMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Choose an option, please:\n");
        menu.append("1. Print all students and their attendance \n");
        menu.append("2. Print all student from up to down\n");
        menu.append("3. Print list of students with attendance below 50%");
        System.out.println(menu.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println(Presenter.dataProcessing(scanner.nextLine()));
        scanner.close();
    }



}
