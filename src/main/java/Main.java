public static void main(String[] args) {
    primitiveTypeCheck();
}

public static void primitiveTypeCheck() {
    Object obj = 42;

    if (obj instanceof int i) {
        System.out.println("The integer value is: " + i);
    }
}
