    public class VariableDemo {

        // ============= INSTANCE VARIABLES =============
        private String instanceVariable = "I'm an instance variable";

        // Instance final variable - must be initialized in constructor or at declaration
        private final String INSTANCE_FINAL = "Instance final - cannot change";
        private final int instanceFinalId;

        // ============= xx VARIABLES =============
        static String staticVariable = "I'm a static variable";

        // Static final variables (constants)
        public static final String CLASS_NAME = "VariableDemo";
        public static final int MAX_SIZE = 1000;
        private static final double PI = 3.14159;

        // ============= CONSTRUCTOR =============
        public VariableDemo(int id) {
            // Initialize instance final variable in constructor
            this.instanceFinalId = id;
        }
        // ============= METHODS DEMONSTRATING LOCAL VARIABLES =============
        public void demonstrateLocalVariables() {
            // Local variables - exist only within this method
            String localVariable = "I'm a local variable";
            int localNumber = 50;
            boolean localFlag = false;

            // Local final variable
            final String LOCAL_FINAL = "Local final - cannot change";
            final int localFinalValue = 25;

            System.out.println("\n=== LOCAL VARIABLES ===");
            System.out.println("Local variable: " + localVariable);
            System.out.println("Local number: " + localNumber);
            System.out.println("Local flag: " + localFlag);
            System.out.println("Local final: " + LOCAL_FINAL);
            System.out.println("Local final value: " + localFinalValue);
            // Demonstrating scope - these variables are not accessible outside this method
            // localFinalValue = 30; // COMPILATION ERROR - cannot reassign final
        }

        // ============= MAIN METHOD FOR DEMONSTRATION =============
        public static void main(String[] args) {
            System.out.println("=== JAVA VARIABLES DEMONSTRATION ===");
            // Static variables can be accessed without creating object
            System.out.println("Static variable before object creation: " + staticVariable);

            // Creating objects
            VariableDemo demo1 = new VariableDemo(1);
            VariableDemo demo2 = new VariableDemo(2);

            demo1.demonstrateLocalVariables();
            // Showing that instance variables are separate for each object
            System.out.println("\n=== INSTANCE VARIABLE INDEPENDENCE ===");
            demo2.instanceVariable = "Demo2's instance variable";
            System.out.println("Demo1 instance variable: " + demo1.instanceVariable);
            System.out.println("Demo2 instance variable: " + demo2.instanceVariable);

            // Showing static variables are shared
            System.out.println("\n=== STATIC VARIABLE SHARING ===");
            VariableDemo.staticVariable = "Changed by class reference";
            System.out.println("Accessed via demo1: " + demo1.staticVariable);
            System.out.println("Accessed via demo2: " + demo2.staticVariable);
            System.out.println("Accessed via class: " + VariableDemo.staticVariable);

            System.out.println("\n=== FINAL VARIABLE SUMMARY ===");
            System.out.println("Instance final (demo1): " + demo1.INSTANCE_FINAL);
            System.out.println("Instance final ID (demo1): " + demo1.instanceFinalId);
            System.out.println("Instance final ID (demo2): " + demo2.instanceFinalId);
            System.out.println("Static final: " + CLASS_NAME);
            System.out.println("Static final: " + MAX_SIZE);
        }
    }