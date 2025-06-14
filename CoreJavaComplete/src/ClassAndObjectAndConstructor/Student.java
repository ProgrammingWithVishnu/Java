package ClassAndObjectAndConstructor;

public class Student {
    public String name;
    public int rollNumber;
    public double marks;
    public String course;
    public String email;

    // Constructor 1: Only name, rollNumber, email (calls constructor 2)
    public Student(String name, int rollNumber, String email) {
        this(name, rollNumber, 0.0, email); // Default marks to 0.0
    }

    // Constructor 2: name, rollNumber, marks, email (calls constructor 3)
    public Student(String name, int rollNumber, double marks, String email) {
        this(name, rollNumber, marks, "Not Assigned", email); // Default course
    }

    // Constructor 3: All parameters (master constructor)
    public Student(String name, int rollNumber, double marks, String course, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.course = course;
        this.email = email;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
        System.out.println("Email: " + email);
        System.out.println("------------------------");
    }
}