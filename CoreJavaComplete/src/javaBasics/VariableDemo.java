package javaBasics;

public class VariableDemo {

        // ============= INSTANCE VARIABLES =============
         String instanceVariable = "I'm an instance variable"; // declared a  variable and intialized also

        // Instance final variable - must be initialized in constructor or at declaration
         final String INSTANCE_FINAL = "Instance final - cannot change";
        private final int instanceFinalId;

        // ============= xx VARIABLES =============
         static String staticVariable = "I'm a static variable";

         static final double PI = 3.14159; // global constant

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
            VariableDemo demo1 = new VariableDemo(1); // creating object
            VariableDemo demo2 = new VariableDemo(2);

demo2.instanceVariable="test";
            System.out.println("Demo1 instance variable: " + demo1.instanceVariable);
            System.out.println("Demo2 instance variable: " + demo2.instanceVariable);
            System.out.println();
            demo2.staticVariable="Vishnu";
            System.out.println("Accessed via demo1: " + demo1.staticVariable);
            System.out.println("Accessed via demo2: " + demo2.staticVariable);

        }
    }