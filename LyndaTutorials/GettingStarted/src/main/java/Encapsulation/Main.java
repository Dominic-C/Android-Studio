package Encapsulation;

public class Main {

    public static void main(String [] args)
    {
        Student A = new Student(12345678, "Mr Ham");
        System.out.println("Student ID: " + A.getID());
        System.out.println("Student name: " + A.getName());
    }

}
