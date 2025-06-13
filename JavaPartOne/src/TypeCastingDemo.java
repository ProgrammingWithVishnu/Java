public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Casting (Widening) - Automatic
        byte byteVal = 10;
        short shortVal = byteVal;  // byte to short
        int intVal = shortVal;     // short to int
        long longVal = intVal;     // int to long
        float floatVal = longVal;  // long to float
        double doubleVal = floatVal; // float to double
        
        System.out.println("Implicit casting chain:");
        System.out.println("byte: " + byteVal + " -> double: " + doubleVal);
        
        // Explicit Casting (Narrowing) - Manual
        double doubleNum = 9.78;
        float floatNum = (float) doubleNum;   // double to float
        long longNum = (long) floatNum;       // float to long
        int intNum = (int) longNum;           // long to int
        short shortNum = (short) intNum;      // int to short
        byte byteNum = (byte) shortNum;       // short to byte
        
        System.out.println("\nExplicit casting chain:");
        System.out.println("double: " + doubleNum + " -> byte: " + byteNum);
        
        // Character casting
        char ch = 'A';
        int asciiValue = ch;        // char to int (implicit)
        char backToChar = (char) asciiValue; // int to char (explicit)
        
        System.out.println("\nCharacter casting:");
        System.out.println("char '" + ch + "' -> int: " + asciiValue);
        System.out.println("int " + asciiValue + " -> char: '" + backToChar + "'");
        
        // String to number conversion
        String numStr = "123";
        int convertedInt = Integer.parseInt(numStr);
        double convertedDouble = Double.parseDouble(numStr);
        
        System.out.println("\nString conversion:");
        System.out.println("String '" + numStr + "' -> int: " + convertedInt);
        
        // Number to String conversion
        int num = 456;
        String numToStr = String.valueOf(num);
        System.out.println("int " + num + " -> String: '" + numToStr + "'");
        
        // Demonstration of data loss
        int largeInt = 300;
        byte smallByte = (byte) largeInt; // Data loss occurs
        System.out.println("\nData loss example:");
        System.out.println("int " + largeInt + " -> byte: " + smallByte);
    }
}