package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentTester {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Creating 2 new students: ");
        System.out.println("Enter Student 1 details:");
        System.out.println("Student 1 Id:");
        String studId1 = bufferedReader.readLine();
        System.out.println("Student 1 First Name:");
        String studFName1 = bufferedReader.readLine();
        System.out.println("Student 1 Last Name:");
        String studLName1 = bufferedReader.readLine();
        StudentEntity stud1 = new StudentEntity(studId1, studFName1, studLName1);

        System.out.println("Enter Student 2 details:");
        System.out.println("Student 2 Id:");
        String studId2 = bufferedReader.readLine();
        System.out.println("Student 2 First Name:");
        String studFName2 = bufferedReader.readLine();
        System.out.println("Student 2 Last Name:");
        String studLName2 = bufferedReader.readLine();
        StudentEntity stud2 = new StudentEntity(studId2, studFName2, studLName2);
        System.out.println();
        System.out.println("****************************");
        System.out.println("Now we display the students by calling toString() method");
        System.out.println("Student 1: ");
        System.out.println(stud1.toString());
        System.out.println();
        System.out.println("Student 2: ");
        System.out.println(stud2.toString());

        System.out.println();
        System.out.println("****************************");
        System.out.println("Now let's change student 1's id number");
        System.out.println("Enter the new id number for Student 1");
        System.out.println("Student 1 Id:");
        String newStudId1 = bufferedReader.readLine();
        stud1.setStudentId(newStudId1);
        System.out.println();
        System.out.println("Student 1's new ID Number is " + stud1.getStudentId());

        System.out.println();
        System.out.println("****************************");
        System.out.println("Now we display the students again by calling toString() method");
        System.out.println("Student 1: ");
        System.out.println(stud1.toString());
        System.out.println();
        System.out.println("Student 2: ");
        System.out.println(stud2.toString());


    }
}
