public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L; // L suffix for long
        
        // Floating point types
        float floatVar = 3.14f; // f suffix for float
        double doubleVar = 3.141592653589793;
        
        // Character and boolean
        char charVar = 'A';
        boolean boolVar = true;
        
        // String (non-primitive)
        String stringVar = "Hello Java";
        
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = new String[3];
        
        // Display values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("float: " + intVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + stringVar);

        //To print arrays we need to use loops

    }
}