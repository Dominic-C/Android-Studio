package Encapsulation;


// The concept of Encapsulation is when we bind the private data with public methods
public class Student {

    private int studentID; // these data needs to be safe
    private String Name;

    public Student(int inputID, String inputName)
    {
        this.studentID = inputID;
        this.Name = inputName;
    }

    public void setName(String inputName)
    {
        this.Name = inputName;
    }

    public String getName()
    {
        return this.Name;
    }

    public void setID(int inputID)
    {
        this.studentID = inputID;
        // normally, when people change data, we maintain a log file of all the changes
        // this way, the user will have to use the setter method and we can log who changed the values, and what the changes were.
        System.out.println("Student ID changed, appending log files...");
    }

    public int getID()
    {
        return this.studentID;
    }
}
