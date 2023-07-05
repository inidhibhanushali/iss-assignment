//this is a example of class, object, state and method
class Student {
    // Instance variables
    public final String name;
    short age;
    private int rollno;

    // Constructor
    public Student(String name,short age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
        this.name = "";
        this.age = 0;
        this.rollno = 0;
    }
    public void setRollNo(int rn) {
        this.rollno = rn;//setter for private variable
    }
    public int getRollNo() {
        return this.rollno;//getter for private variable
    }
    // Methods
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Roll No: " + getRollNo());
    }
}

public class CJava2 {
    public static void main(String[] args) {
        Student student = new Student("Student",(short) 15); // car object created
        student.setRollNo(1);
        student.displayInfo();//printing & display
    }
}
