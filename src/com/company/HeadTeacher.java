package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HeadTeacher {
    String name;
    String surname;
    List<Student> students = new ArrayList<>();
    List<Student> dropOut = new ArrayList<>();


    public HeadTeacher() {
    }

    public HeadTeacher(String name, String surname, List<Student> students) {
        this.name = name;
        this.surname = surname;
        this.students = students;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", students=" + students +
                ", dropOut=" + dropOut +
                '}';
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<Integer> grades = new ArrayList<>();
        List<String> subjects = new ArrayList<>();
        List<String> tests = new ArrayList<>();
        List<String> exams = new ArrayList<>();
        grades.add(9);
        grades.add(7);
        subjects.add("Literature");
        subjects.add("English");
        exams.add("Linguistics");
        tests.add("Economics");

        Student student1 = new Student("Ulyana", "Boiko", 18, 1, true, grades, subjects, tests, exams);
        Student student2 = new Student("Kristina", "Istomina", 19, 3, false, grades, subjects, tests, exams);
        Student student3 = new Student("Xenia", "Remberg", 17, 2, true, grades, subjects, tests, exams);
        Student student4 = new Student("Marina", "Molodzova", 20, 3, false, grades, subjects, tests, exams);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        HeadTeacher HeadTeacher = new HeadTeacher("Inna", "Lebedeva", students);
        System.out.println(HeadTeacher);
    }

    public void printName(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student's name: " + students.get(i).name + ", student's surname: " + students.get(i).surname);
        }

    }

    public void printSubjects(List<String> subjects, List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Subject:");
        String subject = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (subjects.contains(subject) == true) {
                System.out.println("Student's name: " + students.get(i).name + ", student's surname: " + students.get(i).surname);
            }
        }
    }

    public void printTests(List<String> tests, List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test: ");
        String subject = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (tests.contains(subject) == true) {
                System.out.println("Student's name: " + students.get(i).name + ", student's surname: " + students.get(i).surname);
            }
        }
    }

    public void printExams(List<String> exams, List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examination:");
        String subject = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (exams.contains(subject) == true) {
                System.out.println("Student's name: " + students.get(i).name + ", student's surname: " + students.get(i).surname);
            }
        }
    }

    public void printNameIn(List<Student> students, List<Student> dropOut, List<Integer> grades) {

        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        double avr = sum / grades.size();
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student's name: " + students.get(i).name + ", student's surname: " + students.get(i).surname + ", average grade: " + avr);
        }
        for (int i = 0; i < students.size(); i++) {
            if (avr < 4 && students.get(i).hw == false) {
                dropOut.add(students.get(i));
            }
        }
    }
}