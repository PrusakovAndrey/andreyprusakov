package com.example.lesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String ownerFullName;
    private String breed;
    private LocalDate birthDate;
    private List<Award> awards;
    public Cat(String name, String ownerFullName, String breed, LocalDate birthDate) {
        this.name = name;
        this.ownerFullName = ownerFullName;
        this.breed = breed;
        this.birthDate = birthDate;
        this.awards = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getOwnerFullName() {
        return ownerFullName;
    }
    public String getBreed() {
        return breed;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void addAward (Award awards){
        this.awards.add(awards);
    }
    @Override
    public String toString() {
        return "cat [name=" + name + ", ownerFullName=" + ownerFullName + ", breed=" + breed + ", birthDate="
                + birthDate + ", awards=" + awards + "]";
    }
    
    
}
