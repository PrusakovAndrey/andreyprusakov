package com.example.lesson;

import java.time.LocalDate;

public class catMain {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", "Andrey", "No",LocalDate.of(2022,9,3));
        Award awards = new Award(1, "Moscow");
        System.out.println(murzik);
        
    }
}
