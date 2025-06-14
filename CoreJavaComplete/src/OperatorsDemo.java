public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));  // Addition: 13
        System.out.println("a - b = " + (a - b));  // Subtraction: 7
        System.out.println("a * b = " + (a * b));  // Multiplication: 30
        System.out.println("a / b = " + (a / b));  // Division: 3
        System.out.println("a % b = " + (a % b));  // Modulus: 1
        
        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false
        
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y: " + (x && y));  // false (AND)
        System.out.println("x || y: " + (x || y));  // true (OR)
        System.out.println("!x: " + (!x));          // false (NOT)
        
        // Assignment Operators
        int c = 5;
        System.out.println("\n=== Assignment Operators ===");
        System.out.println("Initial c: " + c);
        c += 3;  // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2;  // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 3;  // c = c / 3
        System.out.println("c /= 3: " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3: " + c);
        
        // Unary Operators
        int d = 5;
        System.out.println("\n=== Unary Operators ===");
        System.out.println("Original d: " + d);
        System.out.println("++d (pre-increment): " + (++d));  // 6
        System.out.println("d++ (post-increment): " + (d++)); // 6, then d becomes 7
        System.out.println("Current d: " + d);                // 7
        System.out.println("--d (pre-decrement): " + (--d));  // 6
        System.out.println("d-- (post-decrement): " + (d--)); // 6, then d becomes 5
        System.out.println("Final d: " + d);                  // 5
        
        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\n=== Ternary Operator ===");
        System.out.println("Max of " + a + " and " + b + ": " + max);
        
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is " + result);
        
        // Bitwise Operators (Advanced)
        int p = 5, q = 3;  // 5 = 101, 3 = 011 in binary
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("p & q = " + (p & q));  // AND: 1
        System.out.println("p | q = " + (p | q));  // OR: 7
        System.out.println("p ^ q = " + (p ^ q));  // XOR: 6
        System.out.println("~p = " + (~p));        // NOT: -6
        System.out.println("p << 1 = " + (p << 1)); // Left shift: 10
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift: 2
        
        // Operator Precedence Example
        int result1 = 10 + 5 * 2;        // 20 (multiplication first)
        int result2 = (10 + 5) * 2;      // 30 (parentheses first)
        System.out.println("\n=== Operator Precedence ===");
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
    }
}