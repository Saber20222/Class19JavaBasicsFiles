package com.syntax.class19;

public class StudentTester {
     /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each student's name.
     */
     public static void main(String[] args) {
         Student student=new Student("Student tester",99.9,98.8,99.5);
         student.calculateAvgGrade();
     }
}
