package Comparator;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Student {
    int rollno;
    String name, address;

    public Student (int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.rollno + " " + this.name + " " + this.address;
    }

    public static void main(String [] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println(ar.size());
        System.out.println("" +
                "\nUnsorted");
        for(int i = 0; i < ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }


        System.out.println("\nSort by name");
        Collections.sort(ar, new SortByName());
        for(int j = 0; j < ar.size() ; j++)
        {
            System.out.println(ar.get(j));
        }

        System.out.println("\nSort by roll number");
        Collections.sort(ar, new SortByRoll());
        for(int k = 0; k < ar.size() ; k++)
        {
            System.out.println(ar.get(k));
        }
    }
}
