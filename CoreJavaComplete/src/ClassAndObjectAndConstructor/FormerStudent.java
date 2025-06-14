package ClassAndObjectAndConstructor;

public class FormerStudent extends Student {
    public String graduationYear;
    public String currentJob;

    // Constructor 1: Basic former student info (calls constructor 2)
    public FormerStudent(String name, int rollNumber, String email, String graduationYear) {
        this(name, rollNumber, 0.0, "Graduated", email, graduationYear, "Not Specified");
    }

    // Constructor 2: Former student with marks (calls constructor 3)
    public FormerStudent(String name, int rollNumber, double marks, String course,
                         String email, String graduationYear) {
        this(name, rollNumber, marks, course, email, graduationYear, "Not Specified");
    }

    // Constructor 3: Complete former student info (master constructor)
    public FormerStudent(String name, int rollNumber, double marks, String course,
                         String email, String graduationYear, String currentJob) {
        super(name, rollNumber, marks, course, email); // Call parent constructor
        this.graduationYear = graduationYear;
        this.currentJob = currentJob;
    }

    // Override displayInfo to include former student specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Current Job: " + currentJob);
        System.out.println("========================");
    }
}