
class BaseTypes {

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;


        char c1 = 'Z';
        char c2 = '\\';
        char c3 = 100;

        // byte
        byte by1 = 100;
        // byte by2 = 1000;         
        byte by2 = (byte) 1000;

        // short
        short s1 = 10000;           // within range
        // short s2 = 100000;       // ERROR
        short s2 = (short) 100000;  // explicit narrowing

        // int
        int i1 = 1000000;
        // int i2 = 10000000000L;   // ERROR
        int i2 = (int) 10000000000L; // explicit narrowing

        // long
        long l1 = 10000000000L;
        long l2 = 1000000;          // implicit widening

        // float
        float f1 = 3.14f;
        // float f2 = 2.71828;      // ERROR
        float f2 = (float) 2.71828; // explicit narrowing

        // double
        double d1 = 2.71828;
        double d2 = 3.14f;          // implicit widening

        // Print all values
        System.out.println("boolean: " + b1 + ", " + b2);
        System.out.println("char: " + c1 + ", " + c2 + ", " + c3);
        System.out.println("byte: " + by1 + ", " + by2);
        System.out.println("short: " + s1 + ", " + s2);
        System.out.println("int: " + i1 + ", " + i2);
        System.out.println("long: " + l1 + ", " + l2);
        System.out.println("float: " + f1 + ", " + f2);
        System.out.println("double: " + d1 + ", " + d2);
    }
}
