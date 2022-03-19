package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String surname;
    int age;
    int year;
    List<Integer> grades = new ArrayList<>();
    List<String> subjects = new ArrayList<>();
    List<String> tests = new ArrayList<>();
    List<String> exams = new ArrayList<>();
    boolean hw;

    Student() {

    }

    Student(String name, String surname, int age, int year, boolean hw, List<Integer> grades, List<String> subjects, List<String> tests, List<String> exams) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.year = year;
        this.hw = hw;
        this.grades = grades;
        this.subjects = subjects;
        this.tests = tests;
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", hw=" + hw +
                ", grades=" + grades +
                ", subjects=" + subjects +
                ", tests=" + tests +
                ", exams=" + exams +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int course) {
        this.year = course;
    }

    public boolean getHW() {
        return hw;
    }

    public void setHW(boolean hw) {
        this.hw = hw;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printAllGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void printAllSubjects() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
    }

    public List<String> getTests() {
        return tests;
    }

    public void setTests(List<String> tests) {
        this.tests = tests;
    }

    public void printAllTests() {
        for (int i = 0; i < tests.size(); i++) {
            System.out.println(tests.get(i));
        }
    }

    public List<String> getExams() {
        return exams;
    }

    public void setExams(List<String> exams) {
        this.exams = exams;
    }

    public void printAllExams() {
        for (int i = 0; i < exams.size(); i++) {
            System.out.println(exams.get(i));
        }
    }
}

