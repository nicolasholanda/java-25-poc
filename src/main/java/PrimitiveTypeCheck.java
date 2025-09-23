public static void main(String[] args) {
    primitiveTypeCheck();
}

public static void primitiveTypeCheck() {
    Object obj = 42;

    // Pattern matching for instanceof with primitive types in java 25
    if (obj instanceof int i) {
        System.out.println("The integer value is: " + i);
    }
}
