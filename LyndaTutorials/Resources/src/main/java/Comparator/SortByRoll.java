package Comparator;

import java.util.Collections;
import java.util.Comparator;

class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        // note string.compareTo(target_string)
        /*
        * returns positive value if first string is larger than second string
        * returns negative value if first string is smaller than second string
        * returns 0 if first string is == second string
        * */
        return a.name.compareTo(b.name);

    }
}
