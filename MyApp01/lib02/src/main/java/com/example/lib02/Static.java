package com.example.lib02;

public class Static {
    private String first;
    private String last;
    private static int members = 0;

    public Static(String fn, String ln)
    {
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members: %d\n", first, last, members);
    }

    public static void main(String[] args)
    {
        Static member1 = new Static("John", "Doe");
        Static member2 = new Static("Bob", "Dob");
    }

}
