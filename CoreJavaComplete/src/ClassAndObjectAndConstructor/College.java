package ClassAndObjectAndConstructor;

public class College {
    public static void main(String[] args) {
        System.out.println("=== CURRENT STUDENTS ===");

        // Different ways to create Student objects (demonstrating constructor chaining)
        Student student1 = new Student("Alice", 101, "alice@college.edu");
        Student student2 = new Student("Bob", 102, 85.5, "bob@college.edu");
        Student student3 = new Student("Charlie", 103, 92.0, "Computer Science", "charlie@college.edu");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        System.out.println("=== FORMER STUDENTS ===");

        // Different ways to create FormerStudent objects (demonstrating constructor chaining and super)
        FormerStudent former1 = new FormerStudent("David", 201, "david@gmail.com", "2023");
        FormerStudent former2 = new FormerStudent("Eve", 202, 88.5, "Mathematics",
                "eve@gmail.com", "2022");
        FormerStudent former3 = new FormerStudent("Frank", 203, 95.0, "Physics",
                "frank@gmail.com", "2021", "Software Engineer");

        former1.displayInfo();
        former2.displayInfo();
        former3.displayInfo();

        System.out.println("=== CONSTRUCTOR CHAINING DEMONSTRATION ===");
        System.out.println("student1 created with 3 parameters -> calls this() -> calls this() -> master constructor");
        System.out.println("former1 created with 4 parameters -> calls this() -> calls this() -> calls super()");
    }
}