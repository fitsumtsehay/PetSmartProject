package com.example.demo;


public class Pet {
    private String petName;
    private int age;
    private String gender;
    private String breedType;
    private String petInfo;

    public Pet() {
    }

    public Pet(String petName, int age, String gender, String breedType, String petInfo) {
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.breedType = breedType;
        this.petInfo = petInfo;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    public String getPetInfo() {
        return petInfo;
    }

    public void setPetInfo(String petInfo) {
        this.petInfo = petInfo;
    }
}
